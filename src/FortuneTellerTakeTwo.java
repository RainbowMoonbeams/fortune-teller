

import java.util.Scanner;

public class FortuneTellerTakeTwo {

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

		String vaycayHome;
		String vehicle = "";
		String bankBalance;
		String retirementAge;
		String color;

		System.out.println("What's your first name?");
		String firstName = input.nextLine();

		System.out.println("What's your last name?");
		String lastName = input.nextLine();

		System.out.println("How old are you?");
		int age = input.nextInt();

		System.out.println("What number corresponds to the month were you born in?");
		int birthMonth = input.nextInt();

		System.out.println("Think of the rainbow... which ROY - G - BIV color would you choose?\nTo see a list of the colors type \'help\'");
		color = input.next();

		if (color.equalsIgnoreCase("help")) {
			System.out.println("\nred\norange\nyellow\ngreen\nblue\nindigo\nviolet\nWhich color?");
			color = input.next();
		}

		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		// ---------------------------------------------------------------------------

		// age
		if (age % 2 == 0) {
			retirementAge = "44 years";
		} else {
			retirementAge = "19 years";
		}

		// siblings == vaycayHome
		if (siblings == 0) {
			vaycayHome = "Florida";
		}
		if (siblings == 1) {
			vaycayHome = "Georgia";
		}
		if (siblings == 2) {
			vaycayHome = "Iowa";
		}
		if (siblings == 3) {
			vaycayHome = "Wisconson";
		}
		if (siblings >= 4) {
			vaycayHome = "Ohio";
		} 
		else {
			vaycayHome = "Washington";
		}

		// color == vehicle
		switch (color.toLowerCase()) {
		case "red":
			vehicle = "UFO";
			break;
		case "orange":
			vehicle = "pogo stick";
			break;
		case "yellow":
			vehicle = "hot air baloon";
			break;
		case "green":
			vehicle = "unicycle";
			break;
		case "blue":
			vehicle = "tricycle";
			break;
		case "indigo":
			vehicle = "Fred Flinstone car";
			break;
		case "violet":
			vehicle = "your own two feet";
			break;
		}

		// birthMonth == bankBalance
		if (birthMonth >= 1 && birthMonth <= 4) {
			bankBalance = "$47,000";
		}
		if (birthMonth >= 5 && birthMonth <= 8) {
			bankBalance = "$748,960";
		}
		if (birthMonth >= 9 && birthMonth <= 12) {
			bankBalance = "$98,476";
		}
		else {
			bankBalance = "$66";
		}

//		*[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank,
//		a vacation home in *[location]*, and travel by *[mode of transporation]*.
		
		System.out.println(firstName + " " + lastName + ", you will retire in " + retirementAge + " with " + bankBalance + " in the bank, a vacation home in " + vaycayHome + ", and travel by " + vehicle + ".");
		
	}

}
