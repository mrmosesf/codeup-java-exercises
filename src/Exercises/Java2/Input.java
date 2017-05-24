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
		while (!this.scanner.hasNextLine()) {
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
		String validatingInput = this.scanner.nextLine();
		if (min <= Integer.valueOf(validatingInput) && max >= Integer.valueOf(validatingInput)) {
			return Integer.valueOf(validatingInput);
		} else {
			System.out.println("That number doesn't fall within the range, enter one between " + min + " and " + max);
			getInt(min, max);
			return 0;
		}
	}

	public int getInt() {
		try {
			String validatingInput = this.scanner.nextLine();
			return Integer.valueOf(validatingInput);
		} catch (NumberFormatException e) {
			System.out.println("That's not an integer! Try again!");
			getInt();
			return 0;
		}
	}

	public double getDouble(double min, double max) {
		try {
			String validatingInput = this.scanner.nextLine();
			if (min <= Double.valueOf(validatingInput) && max >= Double.valueOf(validatingInput)) {
				return Double.valueOf(validatingInput);
			} else {
				System.out.println("That number doesn't fall within the range, enter one between " + min + " and " + max);
				getDouble(min, max);
				return 0;
			}
		} catch (NumberFormatException e) {
			System.out.println("That is not an integer! Try again.");
			getDouble(min, max);
			return 0;
		}
	}

	public double getDouble() {
		try {
			String validatingInput = this.scanner.nextLine();
			return Double.valueOf(validatingInput);
		} catch (NumberFormatException e) {
			System.out.println("That's not a double! Try again.");
			getDouble();
			return 0;
		}
	}

	public int getBinary() {
		try {
			String validatingInput = this.scanner.nextLine();
			return Integer.valueOf(validatingInput, 2);
		} catch (NumberFormatException e) {
			System.out.println("That's not a binary value! Try again.");
			getBinary();
			return 0;
		}
	}

	public int getHex() {
		try {
			String validatingInput = this.scanner.nextLine();
			return Integer.valueOf(validatingInput, 16);
		} catch (NumberFormatException e) {
			System.out.println("That's not a hexadecimal value! Try again.");
			getHex();
			return 0;
		}
	}
}
