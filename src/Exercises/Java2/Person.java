package Exercises.Java2;

/**
 * Created by Moses Franco on 5/16/17
 * Codeup
 * Pinnacles
 */
public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello, " + name + "!");
	}

	public static void main(String[] args) {

	}
}
