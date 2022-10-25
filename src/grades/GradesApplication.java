package grades;

import java.util.Arrays;
import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("rickyfizz", new Student("Richard"));
        students.put("tekiefizz", new Student("Tesfalem"));
        students.put("joshyfizz", new Student("Joshua"));
        students.get("rickyfizz").addGrade(98);
        students.get("tekiefizz").addGrade(99);
        students.get("joshyfizz").addGrade(100);
        System.out.println(students.get("rickyfizz").getName());
        System.out.println(students.get("rickyfizz").getGradeAverage());

        System.out.println("------------------------------------------");

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println("|rickyfizz| |tekiefizz| |joshyfizz|");
        System.out.println("What student would you like to see more information on?");

        Input input = new Input();
        input.getString();

    }
}
