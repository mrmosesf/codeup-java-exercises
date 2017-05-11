package Exercises;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/11/17
 * Codeup
 * Pinnacles
 */
public class Methods {

	public static int addition(int x, int y) {
		return x + y;
	}

	public static int subtraction(int x, int y) {
		return x - y;
	}

	public static int multiplication(int x, int y) {
		int answer = 0;
		for (int i=0; i<y; i++){
			answer += x;
		}
		return answer;
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

//	public static int getInteger(int min, int max) {
//		return 1;
//	}


	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);

		System.out.println("Enter your operator:");
		String operator = calculator.nextLine();
		System.out.println("Enter your first value:");
		int a = calculator.nextInt();
		System.out.println("Enter your second value:");
		int b = calculator.nextInt();

//		int min = calculator.nextInt();
//		int max = calculator.nextInt();

		System.out.println("Answer is: ");
		calcBrain(a, b, operator);


	}
}
