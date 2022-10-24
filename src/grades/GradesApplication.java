package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("rickyfizz", new Student("Richard", 95));
        students.put("tekiefizz", new Student("Tesfalem", 100));
        students.put("Joshyfizz", new Student("Joshua", 99));

        System.out.println(students);
    }
}
