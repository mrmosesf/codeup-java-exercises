package Exercises.Java2;

import java.util.ArrayList;

/**
 * Created by mosesfranco on 5/22/17
 * Codeup
 * Pinnacles
 */
public class Student {
	private String name;
	private ArrayList<Double> grades = new ArrayList<>();

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addGrade(double grade){
		grades.add(grade);
	}

	public double getGradeAverage(){
		double gradeCumulative = 0;
		for (Double grade : grades) {
			gradeCumulative += grade;
		}
		return gradeCumulative / grades.size();
	}

	public static void main(String[] args) {
		Student stu = new Student("Steven");

		stu.addGrade(98);
		stu.addGrade(99);
		stu.addGrade(69);
		stu.addGrade(70);
		System.out.println(stu.getGradeAverage());
		stu.addGrade(67);
		stu.addGrade(150);
		System.out.println(stu.getGradeAverage());
	}
}