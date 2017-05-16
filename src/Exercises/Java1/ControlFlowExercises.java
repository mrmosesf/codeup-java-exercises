package Exercises.Java1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Moses Franco on 5/9/17
 * Codeup
 * Pinnacles
 */
public class ControlFlowExercises {
	public static void main(String[] args) {

//		Table of powers
		Scanner user = new Scanner(System.in);
		PrintStream out = System.out;

		out.println("Enter a grade from 0 to 100: ");
		int userInt = user.nextInt();

		if (userInt >= 99) {
			out.println("A+");
		} else if (98 >= userInt && 94 <= userInt) {
			out.println("A");
		} else if (93 >= userInt && 90 <= userInt) {
			out.println("A-");
		} else if (89 >= userInt && 86 <= userInt) {
			out.println("B+");
		} else if (85 >= userInt && 83 <= userInt) {
			out.println("B");
		} else if (82 >= userInt && 80 <= userInt) {
			out.println("B-");
		} else if (79 >= userInt && 76 <= userInt) {
			out.println("C+");
		} else if (75 >= userInt && 73 <= userInt) {
			out.println("C");
		} else if (72 >= userInt && 70 <= userInt) {
			out.println("C-");
		} else if (69 >= userInt && 66 <= userInt) {
			out.println("D");
		} else if (65 >= userInt && 63 <= userInt) {
			out.println("D");
		} else if (62 >= userInt && 60 <= userInt) {
			out.println("D");
		} else if (60 >= userInt && 0 <= userInt) {
			out.println("F");
		} else {
			out.println("That's not a grade");
		}
	}
}