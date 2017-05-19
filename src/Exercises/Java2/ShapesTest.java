package Exercises.Java2;

/**
 * Created by Moses Franco on 5/19/17
 * Codeup
 * Pinnacles
 */
public class ShapesTest {
	public static void main(String[] args) {
		Measurable myShape = new Rectangle(5, 4);
		System.out.println(myShape.getPerimeter());
		System.out.println(myShape.getArea());
	}

	/*Code will fail to compile if getPerimeter is left from the Rectangle class because the class implements the
	Measurable interface, which is a method of the aforementioned interface*/
	/*Nothing, since both methods return the answer to their respective purposes, not print*/
}
