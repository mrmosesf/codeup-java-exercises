package Exercises;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/11/17
 * Codeup
 * Pinnacles
 */
public class Methods {

	public static void calcPrompt(Scanner calculator) {
		System.out.println("Enter your operator:");
		String operator = calculator.nextLine();
		System.out.println("Enter your first value:");
		int a = calculator.nextInt();
		System.out.println("Enter your second value:");
		int b = calculator.nextInt();
		calcBrain(a, b, operator);
		System.out.println("Answer is: ");

	}

	public static int addition(int x, int y) {
		return x + y;
	}

	public static int subtraction(int x, int y) {
		return x - y;
	}

	public static int multiplication(int x, int y) {
//		int answer = 0;
//		for (int i=0; i<y; i++){
//			answer += x;
//		}
//		return answer;

		if (x == 0 || y == 0) {
			return 0;
		} else if (y < 0) {
			return multiplication(x, y + 1) + -x;
		} else {
			return multiplication(x, y - 1) + x;
		}
	}

	public static int division(int x, int y) {
		if (y != 0) {
			return x / y;
		} else {
			return 0;
		}
	}

	public static int modulus(int x, int y) {
		return x % y;
	}

	public static void calcBrain(int a, int b, String operator) {
		switch (operator) {
			case "+":
				System.out.println(addition(a, b));
				break;
			case "-":
				System.out.println(subtraction(a, b));
				break;
			case "*":
				System.out.println(multiplication(a, b));
				break;
			case "/":
				System.out.println(division(a, b));
				break;
			case "%":
				System.out.println(modulus(a, b));
				break;
			default:
				System.out.println("Uh");
		}

	}

	public static int getInteger(int min, int max) {
		Scanner numberChecked = new Scanner(System.in);
		int userNumber = numberChecked.nextInt();

		if (min <= userNumber && userNumber <= max) {
			System.out.println("Yup, that will do");
			return userNumber;
		} else {
			System.out.println("Nope, try again");
			getInteger(min, max);
			return 0;
		}
	}

	public static long factorialCalc(Scanner calculator) {
		String wishToContinue;
		long ans;
		do {
			long temp = 1;
			System.out.println("Enter a number between 1 and 10 to be factored");
			int j = calculator.nextInt();
			for (int i = 1; i <= j; i++) {
				temp *= i;
			}
			System.out.println("Answer is: " + temp);
			ans = temp;
			System.out.println("Want to continue?");
			wishToContinue = calculator.next();
		} while (wishToContinue.equalsIgnoreCase("y"));
		return ans;
	}


	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
//		calcPrompt(calculator);


//		System.out.print("Enter a number between 1 and 10: ");
//		int userInput = getInteger(1, 10);

		factorialCalc(calculator);

	}
}
