package Exercises.Java2;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/16/17
 * Codeup
 * Pinnacles
 */
public class Input {
	private Scanner scanner;

	public Input(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getString() {
		String validating;
		while(!this.scanner.hasNextLine()){
			System.out.println("That's not a valid input");
			getString();
		}
		validating = this.scanner.nextLine();
		return validating;
	}

	public boolean yesNo() {
		String validatingInput = this.scanner.nextLine();
		if ("y".equalsIgnoreCase(validatingInput) || "yes".equalsIgnoreCase(validatingInput)) {
			return true;
		} else {
			return false;
		}
	}

	public int getInt(int min, int max) {
		int validatingInput = this.scanner.nextInt();
		if (min <= validatingInput && max >= validatingInput) {
			return validatingInput;
		} else {
			System.out.println("That number doesn't fall within the range, enter one between " + min + " and " + max);
			getInt(min, max);
			return 0;
		}
	}

	public int getInt() {
		return this.scanner.nextInt();
	}

	public double getDouble(double min, double max) {
		double validatingInput = this.scanner.nextDouble();
		if (min <= validatingInput && max >= validatingInput) {
			return validatingInput;
		} else {
			System.out.println("That number doesn't fall within the range, enter one between " + min + " and " + max);
			getDouble(min, max);
			return 0;
		}
	}

	public double getDouble() {
		return this.scanner.nextDouble();
	}
}
