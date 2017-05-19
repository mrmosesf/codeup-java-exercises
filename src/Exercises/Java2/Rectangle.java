package Exercises.Java2;

/**
 * Created by Moses Franco on 5/19/17
 * Codeup
 * Pinnacles
 */
public class Rectangle {
	private int length;
	private int width;

//	This constructor class should be kept private, since it can be called on my its children
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getPerimeter() {
		return 2 * length + 2 * width;
	}

	public int getArea() {
		return length * width;
	}
}
