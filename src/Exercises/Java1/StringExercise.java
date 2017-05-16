package Exercises.Java1;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/11/17
 * Codeup
 * Pinnacles
 */
public class StringExercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String message = input.nextLine();

		if (message.endsWith("?")) {
			System.out.println("Sure.");
		} else if (message.toUpperCase().equals(message) || message.endsWith("!") && !message.toLowerCase().equals(message)) {
			System.out.println("Whoa, chill out!");
		} else if (message.isEmpty()) {
			System.out.println("Fine. Be that way!");
		} else {
			System.out.println("Whatever");
		}
	}
}
