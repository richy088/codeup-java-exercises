package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("rickyfizz", new Student("Richard"));
        students.put("tekiefizz", new Student("Tesfalem"));
        students.put("Joshyfizz", new Student("Joshua"));
        students.get("rickyfizz").addGrade(98);
        System.out.println(students.get("rickyfizz").getGradeAverage());

        System.out.println(students);
    }
}
