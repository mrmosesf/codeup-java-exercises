package Exercises;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/8/17
 * Codeup
 * Pinnacles
 */

public class ConsoleExercises {
	public static void main(String[] args) {

//		Asks user to input a integer, and then prints it
		System.out.println("Input a number below, please");
		Scanner scanInt = new Scanner(System.in);
		int resultInt = scanInt.nextInt();
		System.out.println(resultInt);

//		Ask user to input three words, then prints each word on a differnet line
		System.out.println("Input three words");
		Scanner scanStrings = new Scanner(System.in).useDelimiter("\\s+");
		String userString1 = scanStrings.next();
		String userString2 = scanStrings.next();
		String userString3 = scanStrings.next();
		System.out.println(userString1);
		System.out.println(userString2);
		System.out.println(userString3);

//		Asks user to input a sentence, then prints the sentence in its entirety
		System.out.println("Input a sentence");
		Scanner scanSentence = new Scanner(System.in);
		String userSentence = scanSentence.nextLine();
		System.out.println(userSentence);

//		Ask user for the measurements of the Codeup class room, calculates its area, perimeter, and volume, then prints the result for the user
		System.out.println("Let's calculate the perimeter and area of the room \nPlease enter the length");
		Scanner scanRoom = new Scanner(System.in);
		String lengthString = scanRoom.nextLine();
		double length = Double.parseDouble(lengthString);
		System.out.println("Please enter width");
		String widthString = scanRoom.nextLine();
		double width = Double.parseDouble(widthString);
		System.out.println("Please enter height");
		String heightString = scanRoom.nextLine();
		double height = Double.parseDouble(heightString);

//		Calculates results from provided values
		double perimeter = (2* length) + (2*width);
		double area = length * width;
		double volume = length * width * height;

//		Prints results
		System.out.println("The perimeter is: " + perimeter + "ft");
		System.out.println("The area is: " + area + "sq. ft");
		System.out.println("The volume is: " + volume + "cu. ft");


	}
}
