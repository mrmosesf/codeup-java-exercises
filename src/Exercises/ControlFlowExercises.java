package Exercises;

import java.io.PrintStream;

/**
 * Created by Moses Franco on 5/9/17
 * Codeup
 * Pinnacles
 */
public class ControlFlowExercises {
	public static void main(String[] args) {

//		Fizzbuzz
		for(int i=1;i<=100;i++){
			PrintStream out = System.out;
			if(i%3 == 0 && i%5 == 0){
				out.println("FizzBuzz");
			}
			else if(i%3 == 0){
				out.println("Fizz");
			}
			else if(i%5 == 0){
				out.println("Buzz");
			}
			else {
				out.println(i);
			}
		}

	}
}