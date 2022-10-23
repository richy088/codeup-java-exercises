package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        new ArrayList<>();
    }

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
        for (i=0; i < grades.size(); i++) {
            sum += grades[i];
        }
        return sum / grades.size();
    };

    public static void main(String[] args) {
//        Student student = new Student("Richard", 97);
    }
}
