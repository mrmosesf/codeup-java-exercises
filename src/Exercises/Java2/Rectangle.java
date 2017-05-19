package Exercises.Java2;

/**
 * Created by Moses Franco on 5/19/17
 * Codeup
 * Pinnacles
 */
public class Rectangle extends Quadrilateral implements Measurable {

	public Rectangle(int length, int width) {
		super(length, width);
	}

	@Override
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	void setLength(int length) {
		this.length = length;
	}

	@Override
	void setWidth(int width) {
		this.width = width;
	}
}
