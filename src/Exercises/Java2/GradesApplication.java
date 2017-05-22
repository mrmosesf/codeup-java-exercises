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

		students.forEach((key, value) -> System.out.print("|" + key + "| "));

		getStudentInfo(students, scanner);
	}

	public static void seeAnotherStudent(Map<String, Student> students, Scanner scanner) {
		System.out.println("\nWould you like to see another student?\n");
		if (scanner.nextLine().equalsIgnoreCase("y")){
			getStudentInfo(students, scanner);
		}
		else if (scanner.nextLine().equalsIgnoreCase("n")){
			System.out.println("Goodbye, and have a wonderful day!");
			System.exit(0);
		}
		else {
			System.out.println("Hey, that's not really an answer");
			seeAnotherStudent(students, scanner);
		}
		System.out.println(scanner);
	}

	public static void getStudentInfo(Map<String, Student> students, Scanner scanner) {
		System.out.println("\nWhat student would you like to see more information on?\n");

		String checkMap = scanner.nextLine();

		if (students.get(checkMap) == null) {
			System.out.println("Sorry, no student found with the github username of \"" + checkMap + "\".");
			seeAnotherStudent(students, scanner);
		}
		else {
			System.out.println("\nName: "+students.get(checkMap).getName()+ " - Github Username: " + checkMap + "\nCurrent Average: "+ students.get(checkMap).getGradeAverage());
		}
		System.out.println(scanner);
		seeAnotherStudent(students, scanner);
		scanner.nextLine();
	}
}
