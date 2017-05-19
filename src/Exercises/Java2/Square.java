package Exercises.Java2;

/**
 * Created by Moses Franco on 5/19/17
 * Codeup
 * Pinnacles
 */
public class Square extends Rectangle {
	//This variable in declared, but will not be ever initialized, while these two methods override the parent, the constructor does not
	private int side;

	//	Can be kept private since this class will use its parent's constructor, but will be public for testing purposes
	public Square(int side) {
		super(side, side);
	}

	public int getPerimeter() {
		return 4 * side;
	}

	public int getArea() {
		return side * side;
	}
}
