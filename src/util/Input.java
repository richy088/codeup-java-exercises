package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
//        System.out.println(input.yesNo());
        System.out.println(input.getInt(1, 10));
    }

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
        if (userInput > min && userInput < max) {
            return userInput;
        } else {
            //doesn't call own method but goes to the one below
            return getInt();
        }
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public Input() {
        scanner = new Scanner(System.in);
    }


        double getDouble(double min, double max) {
            return 0.44;
        }

        double getDouble() {
            return 0.55;
        }


}


