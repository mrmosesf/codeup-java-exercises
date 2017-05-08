package Exercises;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/8/17
 * Codeup
 * Pinnacles
 */

public class ConsoleExercises {
	public static void main(String[] args) {

////		Asks user to input a integer, and then prints it
//		System.out.println("Input a number below, please");
//		Scanner scanInt = new Scanner(System.in);
//		int resultInt = scanInt.nextInt();
//		System.out.println(resultInt);
//
////		Ask user to input three words, then prints each word on a different line
//		System.out.println("Input three words");
//		Scanner scanStrings = new Scanner(System.in).useDelimiter("\\s+"); //Turns out that the use of delimiter is kinda useless, going to keep it
//		String userString1 = scanStrings.next();
//		String userString2 = scanStrings.next();
//		String userString3 = scanStrings.next();
//		System.out.println(userString1);
//		System.out.println(userString2);
//		System.out.println(userString3);
//
////		Asks user to input a sentence, then prints the sentence in its entirety
//		System.out.println("Input a sentence");
//		Scanner scanSentence = new Scanner(System.in);
//		String userSentence = scanSentence.nextLine();
//		System.out.println(userSentence);
//
////		Ask user for the measurements of the Codeup class room, calculates its area, perimeter, and volume, then prints the result for the user
//		System.out.println("Let's calculate the perimeter and area of the room \nPlease enter the length");
//		Scanner scanRoom = new Scanner(System.in);
//		String lengthString = scanRoom.nextLine();
//		double length = Double.parseDouble(lengthString);
//		System.out.println("Please enter width");
//		String widthString = scanRoom.nextLine();
//		double width = Double.parseDouble(widthString);
//		System.out.println("Please enter height");
//		String heightString = scanRoom.nextLine();
//		double height = Double.parseDouble(heightString);
//
////		Calculates results from provided values
//		double perimeter = (2* length) + (2*width);
//		double area = length * width;
//		double volume = length * width * height;
//
////		Prints results
//		System.out.println("The perimeter is: " + perimeter + "ft");
//		System.out.println("The area is: " + area + "sq. ft");
//		System.out.println("The volume is: " + volume + "cu. ft");



//		Bonus problem
		System.out.println("Let's order a pizza, pick a size:\nSmall\tMedium\tLarge\n$5  \t$7  \t$9");
		System.out.println("_________________________");
		System.out.println("Select a sauce:\nTomato Sauce\tMarinara Sauce\tBBQ Sauce\tParmesan White Sauce\tAlfredo Sauce");
		System.out.println("_________________________");
		System.out.println("Pick 10 toppings, $1.50 each:\nPepperoni\tItalian Salami\tBeef\tHam\tBacon\nMushrooms\tBlack Olives\tPineapple\tGreen Peppers\tJalapeno");
		System.out.println("_________________________");
	}
}
