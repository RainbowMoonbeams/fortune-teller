import java.util.Scanner;

public class FortuneTellerApp {
	public static void main(String[] args) {

		// Fortune Teller App
		// Ask for first name.
		// Ask for last name.
		// Ask for age.
		// Ask for birth month.
		// Ask for a color (ROYGBIV options)
		// Ask if they need help with color options.
		// Prompt to ask for a color again.
		// Ask for number of siblings.
		// Spit out a sentence with their fortune.

		Scanner input = new Scanner(System.in);

		// Declaring variables for later
		String retireIn;
		String bankBalance;
		String vacationHome = "";
		String favColor = "";

		// Intro
		System.out.println("I'm going to ask you for some information then I'll tell you your fortune.");
		// System.out.println("If you want to quit at any time, type
		// \"quit\".");

		System.out.println("Ready?? Let's begin...");

		// Question 1: ask for first name [firstName]
		System.out.println("What's your first name?");
		String firstName = input.nextLine();

		// Question 2: ask for last name [lastName]
		System.out.println("What's your last name?");
		String lastName = input.nextLine();

		// Question 3: ask for age [int age]
		System.out.println("How old are you?");
		int age = input.nextInt();

		// Question 4: ask for birth month number [int birthMonth]
		System.out.println("Tell me the number that corresponds to your birth month.");
		System.out.println("Ex: Jan = 1; Feb = 2; Mar = 3; etc...");
		int birthMonth = input.nextInt();

		// Question 5: ask for color choice (ROYGBIV) [colorResponse]
		// Question 5a: ask if they need help
		System.out.println("Pick a color of the rainbow (remember ROY - G - BIV?)");
		System.out.println("Hint: To see the list of ROYGBIV colors, type \"Help\"");
		String colorResponse = input.next();

		// 5b: if the need help, ignoreCase("help")
		// Question 5: ask for color choice again
		if (colorResponse.equalsIgnoreCase("help")) {
			System.out.println("I can help you.");
			System.out.println("Your color options are: red, orange, yellow, green, blue, indigo, violet.");
			System.out.println("Type your color choice.");
			colorResponse = input.next();
		}

		// Question 6: ask for siblings [mySiblings]
		System.out.println("How many siblings do you have?");
		int mySiblings = input.nextInt();

		// -----------------------------------------------------------------------------
		// Part 2

		// Variable 3 age --> retireIn
		if (age % 2 == 0) {
			retireIn = "20 years";
		} else {
			retireIn = "40 years";
		}

		// Variable 4
		// birthMonth 1-4 --> $200,000
		// birthMonth 5-8 --> $400,000
		// birthMonth 9-12 --> $45,000
		// birthMonth <=0 || birthMonth > 12 --> $0
		if (birthMonth > 0 && birthMonth < 5) {
			bankBalance = "$200,000";
		} else if (birthMonth > 4 && birthMonth < 9) {
			bankBalance = "$1,000,000";
		} else if (birthMonth > 8 && birthMonth < 13) {
			bankBalance = "$45,000";
		} else {
			bankBalance = "$0 (wamp wamp...)";
		}

		// Variable 6
		// mySiblings == 0 --> vacationHome #1
		// mySiblings == 1 --> vacationHome #2
		// mySiblings == 2 --> vacationHome #3
		// mySiblings == 3 --> vacationHome #4
		// mySiblings > 3 --> vacationHome #5
		// mySiblings < 0 --> vacationHome #6
		if (mySiblings == 0) {
			vacationHome = "Bar Harbor, ME,";
		} else if (mySiblings == 1) {
			vacationHome = "Seattle, WA,";
		} else if (mySiblings == 2) {
			vacationHome = "Portland, OR,";
		} else if (mySiblings == 3) {
			vacationHome = "Syracuse, Italy (way to go!),";
		} else if (mySiblings > 3) {
			vacationHome = "Alexandria Bay, NY";
		} else if (mySiblings < 0) {
			vacationHome = "Hell, ";
		}

		// Variable 5
		// switch/case colorResponse --> mode of transport
		switch (colorResponse.toLowerCase()) {
		case "red":
			favColor = "a canoe! Row away :)";
			break;
		case "orange":
			favColor = "a bicycle. Them thighs though...";
			break;
		case "yellow":
			favColor = "an ice cream truck... and then you go insane";
			break;
		case "green":
			favColor = "a Mega Bus. What a hot mess!";
			break;
		case "blue":
			favColor = "a stair car. You're gonna get hop-on's.";
			break;
		case "indigo":
			favColor = "a hot air balloon. Watch out for bird strikes!";
			break;
		default:
			favColor = "a submarine... good luck getting anywhere...";
			break;
		}

		// -----------------------------------------------------------------------------
		// Part 3
		// Tell user their fortune

		System.out.println(firstName + " " + lastName + ", you will retire in " + retireIn + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationHome + " and your mode of travel will be "
				+ favColor);
	}
}
