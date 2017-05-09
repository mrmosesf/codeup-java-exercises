package Exercises;

/**
 * Created by Moses Franco on 5/9/17
 * Codeup
 * Pinnacles
 */
public class ControlFlowExercises {
	public static void main(String[] args) {

		long j = 2;
		do {
			System.out.println(j);
			j*=j;
		} while (j <= 1000000);
	}
}