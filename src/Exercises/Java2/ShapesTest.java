package Exercises.Java2;

/**
 * Created by Moses Franco on 5/19/17
 * Codeup
 * Pinnacles
 */
public class ShapesTest {
	public static void main(String[] args) {
		Rectangle box1 = new Rectangle(4, 5);
		System.out.println(box1.getPerimeter());
		System.out.println(box1.getArea());

		Rectangle box2 = new Square(5);
		System.out.println(box2.getPerimeter());
		System.out.println(box2.getArea());
	}
}
