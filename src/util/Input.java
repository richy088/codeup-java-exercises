package util;

import grades.GradesApplication;
import grades.Student;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        System.out.println("Enter input: ");
        return scanner.next();
    }

    //asks for input twice? why?
    public void yesNo() {
        System.out.println("Enter yes or no: ");
        String userInput = scanner.nextLine();
        if (userInput.equals("yes") || userInput.equals("y")) {
            System.out.println("Would you like to enter a new item?");
        } else {
            System.out.println("The end");
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between: " + min + " and " + max);
        int userInput = scanner.nextInt();
        while (userInput < min || userInput > max) {
            System.out.println("Enter an integer between: " + min + " and " + max);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public Input() {
        scanner = new Scanner(System.in);
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    double getDouble(double min, double max) {
        System.out.println("Enter double number between: " + min + " and " + max);
        double userInput = scanner.nextDouble();
        while (userInput < min || userInput > max) {
            System.out.println("Enter a double number between: " + min + " and " + max);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }

}


