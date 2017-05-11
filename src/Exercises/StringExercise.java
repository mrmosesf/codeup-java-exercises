package Exercises;

/**
 * Created by Moses Franco on 5/11/17
 * Codeup
 * Pinnacles
 */
public class StringExercise {
	public static void main(String[] args) {
		String message = "I found out about YOU!";

		if (message.endsWith("?")) {
			System.out.println("Sure.");
		} else if (message.toUpperCase().equals(message)) {
			System.out.println("Whoa, chill out!");
		} else if (message.trim().equals("")) {
			System.out.println("Fine. Be that way!");
		} else {
			System.out.println("Whatever");
		}
	}
}
