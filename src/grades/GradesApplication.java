package grades;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("rickyfizz", new Student("Richard"));
        students.get("rickyfizz").addGrade(100);
        students.get("rickyfizz").addGrade(99);
        students.get("rickyfizz").addGrade(98);
        System.out.println(students.get("rickyfizz").getName() + " has an average GPA of " + students.get("rickyfizz").getGradeAverage());

        students.put("tekiefizz", new Student("Tesfalem"));
        students.get("tekiefizz").addGrade(97);
        students.get("tekiefizz").addGrade(96);
        students.get("tekiefizz").addGrade(95);
        System.out.println(students.get("tekiefizz").getName() + " has an average GPA of " + students.get("tekiefizz").getGradeAverage());

        students.put("joshyfizz", new Student("Joshua"));
        students.get("joshyfizz").addGrade(94);
        students.get("joshyfizz").addGrade(93);
        students.get("joshyfizz").addGrade(92);
        System.out.println(students.get("joshyfizz").getName() + " has an average GPA of " + students.get("joshyfizz").getGradeAverage());

        students.put("dannyfizz", new Student("Daniel"));
        students.get("dannyfizz").addGrade(91);
        students.get("dannyfizz").addGrade(90);
        students.get("dannyfizz").addGrade(89);
        System.out.println(students.get("dannyfizz").getName() + " has an average GPA of " + students.get("dannyfizz").getGradeAverage());

        System.out.println("----------------------------------------------");

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println("|rickyfizz| |tekiefizz| |joshyfizz| |dannyfizz|");
        System.out.println("What student would you like to see more information on?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        while (!userInput.equals("no")) {
            if (students.containsKey(userInput)) {
                System.out.println(students.get(userInput).getName() + " has an average GPA of " + students.get(userInput).getGradeAverage());
            } else {
                System.out.println("No user with that username was found");
            }
            System.out.println("Which other student would you like info on?");
            userInput = scanner.next();
        }

        System.out.println("Goodbye, have a wonderful day!");


//        Input input = new Input();
//        input.getString();

    }
}
