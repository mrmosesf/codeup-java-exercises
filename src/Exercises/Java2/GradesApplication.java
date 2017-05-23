package Exercises.Java2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Moses Franco on 5/22/17
 * Codeup
 * Pinnacles
 */
public class GradesApplication {
	public static void main(String[] args) {
		Map<String, Student> students = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		students.put("stuj", new Student("Steve Jobs"));
		students.get("stuj").addGrade(50);
		students.get("stuj").addGrade(60);
		students.get("stuj").addGrade(70);

		students.put("GoliathFighter", new Student("David"));
		students.get("GoliathFighter").addGrade(60);
		students.get("GoliathFighter").addGrade(70);
		students.get("GoliathFighter").addGrade(80);

		students.put("AnArtistFormerlyKnown", new Student("Prince"));
		students.get("AnArtistFormerlyKnown").addGrade(70);
		students.get("AnArtistFormerlyKnown").addGrade(80);
		students.get("AnArtistFormerlyKnown").addGrade(90);

		students.put("ASlightlyLongerNameSoItLooksCool", new Student("Dork"));
		students.get("ASlightlyLongerNameSoItLooksCool").addGrade(80);
		students.get("ASlightlyLongerNameSoItLooksCool").addGrade(90);
		students.get("ASlightlyLongerNameSoItLooksCool").addGrade(100);

		System.out.println("\nWelcome\nHere are the Github usernames of our students:\n");

		printStudents(students);

		getStudentInfo(students, scanner);
	}

	public static void printStudents(Map<String, Student> students) {
		students.forEach((key, value) -> System.out.print("|" + key + "| "));
	}

	public static void getStudentInfo(Map<String, Student> students, Scanner scanner) {
		System.out.println("\n\nWhat student would you like to see more information on?\n");

		String checkMap = scanner.nextLine();

		if (students.get(checkMap) == null) {
			System.out.println("Sorry, no student found with the github username of \"" + checkMap + "\".");
			seeAnotherStudent(students, scanner);
		} else if (checkMap.equalsIgnoreCase("help")) {
			System.out.println("Here's the list of enrolled students again");
			printStudents(students);
			seeAnotherStudent(students, scanner);
		} else {
			System.out.println("\nName: " + students.get(checkMap).getName() + " - Github Username: " + checkMap + "\nCurrent Average: " + students.get(checkMap).getGradeAverage());
		}
		seeAnotherStudent(students, scanner);
	}

	public static void seeAnotherStudent(Map<String, Student> students, Scanner scanner) {
		System.out.println("\nWould you like to see another student?\n");
		String userResponse = scanner.nextLine();
		if (userResponse.equalsIgnoreCase("y")) {
			getStudentInfo(students, scanner);
		} else if (userResponse.equalsIgnoreCase("n")) {
			System.out.println("\nGoodbye, and have a wonderful day!");
			System.exit(0);
		} else if (userResponse.equalsIgnoreCase("help")) {
			System.out.println("\nHere's the list currently enrolled students\n\n");
			printStudents(students);
			seeAnotherStudent(students, scanner);
		} else {
			seeAnotherStudent(students, scanner);
		}
	}
}
