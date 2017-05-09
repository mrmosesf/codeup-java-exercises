package Exercises;

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
		out.println("What number would you like to go up to?");
		int userInt = user.nextInt();
		out.println("Here is your table!\nnumber | squared | cubed\n------ | ------- | -----");

		for (int i = 1; i <= userInt; i++) {
			out.println(i + "\t   |" + i * i + "\t\t |" + i * i * i);
		}
	}
}