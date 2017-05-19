package Exercises.Java2;

/**
 * Created by Moses Franco on 5/19/17
 * Codeup
 * Pinnacles
 */
public class Square extends Quadrilateral {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public double getPerimeter() {
		return length * 4;
	}

	@Override
	public double getArea() {
		return width * width;
	}

	@Override
	void setLength(int length) {
		this.length = length;
		this.width = length;
	}

	@Override
	void setWidth(int width) {
		this.length = width;
		this.width = width;
	}
}
