package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

//    public Student(String name, ArrayList<Integer> grades) {
//        this.name = name;
//        new ArrayList<Integer>();
//    }

    // returns the student's name
    public String getName() {
        return this.name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int i=0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    };

    public static void main(String[] args) {
        Student student = new Student();
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);
        System.out.println(student.grades);
        System.out.println("The average score is: " + student.getGradeAverage());
    }
}
