package Exercises.Java2;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/16/17
 * Pinnacles
 * Codeup
 */
public class InputTest {
	public static void main(String[] args) {
		Scanner testScanner = new Scanner(System.in);
		Input tester = new Input(testScanner);

		System.out.println(tester.getString());

	}
}
