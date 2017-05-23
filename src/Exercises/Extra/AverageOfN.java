package Exercises.Extra;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/23/17
 * Codeup
 * Pinnacles
 */
public class AverageOfN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		getNAverage(scanner);
	}

	private static void getNAverage(Scanner scanner) {
		System.out.println("\nHow many numbers do you want to average?");
		int numbersNToAverage = scanner.nextInt();
		double runningAverage = 0;

		for (int i = 1; i <= numbersNToAverage; i++) {
			System.out.println("Enter number " + i);
			runningAverage += scanner.nextDouble();
		}
		System.out.printf("The average value is: %.2f%n", (runningAverage / numbersNToAverage));
	}
}
