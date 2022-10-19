package util;

import java.util.Scanner;

public class Input {


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

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
    }

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
        }

        boolean yesNo() {
            return true;
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


