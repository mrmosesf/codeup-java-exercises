package Exercises;

import java.util.Scanner;

/**
 * Created by Moses Franco on 5/11/17
 * Codeup
 * Pinnacles
 */
public class Methods {

	public static void calcPrompt(Scanner calculator) {

//		Asks the user to enter relevant variables, and then calls the next method in calculation
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
//		Nothing fancy, you take two integers and you add them together
		return x + y;
	}

	public static int subtraction(int x, int y) {
//		Like the above method, but you subtract
		return x - y;
	}

	public static int multiplication(int x, int y) {
//		FOR loop to multiply by adding
//      int answer = 0;
//		for (int i=0; i<y; i++){
//			answer += x;
//		}
//		return answer;

//		Recursively adds to effectively multiply
		if (x == 0 || y == 0) {
//			Seems odd to have a zero here, but it works to stop the program, and anything times 0 is just that
			return 0;
		} else if (y < 0) {     //Used to catch multiplications by a -y, with either a +x or -x
//			A plus and the negative x is done because one, or both the variables is negative, and the product should reflect that
			return multiplication(x, y + 1) + -x;
		} else {
//			It is assumed that neither x or y is negative, therefore the product is going to be a positive integer
			return multiplication(x, y - 1) + x;
		}
	}

	public static int division(int x, int y) {
		if (y != 0) {   //Catches trying to divide by zero
			return x / y;
		} else {    //Returns zero, even though anything divided by zero isn't possible, can't return another result from this function
			return 0;
		}
	}

	public static int modulus(int x, int y) {
//		Just a vanilla modulus method
		return x % y;
	}

	public static void calcBrain(int a, int b, String operator) {

//		Based on the operator, the switch case will then call the appropriate method to perform the actual calculation
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

//		Created a new Scanner because exercise calls for the above method signature
		Scanner numberChecked = new Scanner(System.in);
		int userNumber = numberChecked.nextInt();

//		The number is checked against the min and max passed as a parameter
		if (min <= userNumber && userNumber <= max) {
			System.out.println("Yup, that will do");
			return userNumber;
		} else {    //We recursively call the method because the int passed did not satisfy the above IF
			System.out.println("Nope, try again");
			getInteger(min, max);
			return 0;
		}
	}

	public static long factorialCalc(Scanner calculator) {
		String wishToContinue;
		long ans;
		do {
//			Upon each loop, this new variable, temp, will be initialized, so the previous result isn't carried over
			long temp = 1;
			System.out.println("Enter a number between 1 and 10 to be factored");
			int j = calculator.nextInt();
			for (int i = 1; i <= j; i++) {
				temp *= i;
			}
			System.out.println("Answer is: " + temp);
//			Passing the result to the less local variables, ans, which will be returned and be printed
			ans = temp;
//			Ask the user if they wish to continue, either satisfying the WHILE or not, stopping it
			System.out.println("Want to continue?");
			wishToContinue = calculator.next();
		} while (wishToContinue.equalsIgnoreCase("y"));     //In a WHILE loop to check if the user wishes to continue factorial-izing(sp?)
		return ans;
	}


	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
//
//      Calls the calculator method which will prompt the user for operators and numbers
//      calcPrompt(calculator);


//		Prompts the user for a number between 1 and 10, if the user enters a number out of range, prompts them for another
//      System.out.print("Enter a number between 1 and 10: ");
//		int userInput = getInteger(1, 10);

//		Calls the method that will prompt the user for a number to calculate its factorial, until the user declines
		factorialCalc(calculator);

	}
}
