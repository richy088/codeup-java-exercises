package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
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

    public Input() {
        scanner = new Scanner(System.in);
    }



        int getInt(int min, int max) {
            return 7;
        }

        int getInt() {
            return 8;
        }

        double getDouble(double min, double max) {
            return 0.44;
        }

        double getDouble() {
            return 0.55;
        }


}


