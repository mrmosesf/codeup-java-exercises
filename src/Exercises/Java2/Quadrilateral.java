package Exercises.Java2;

/**
 * Created by Moses Franco on 5/19/17
 * Codeup
 * Pinnacles
 */
abstract class Quadrilateral extends Shape implements Measurable {
	protected int length;
	protected int width;

	public Quadrilateral(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	abstract void setLength(int length);
	abstract void setWidth(int width);
}
