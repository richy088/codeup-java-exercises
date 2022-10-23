package util;

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
    public boolean yesNo() {
        if (getString().equals("yes") || getString().equals("y")) {
            return true;
        } else {
            return false;
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

    public double getDouble() {
        System.out.println("Enter a double number");
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


