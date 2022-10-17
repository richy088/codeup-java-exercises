import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //psvm + tab will create public static void main class
        add(4, 3);
        subtract(4, 3);
        multiply(4, 3);
        divide(4, 3);
        mod(4, 3);

        System.out.println(getInteger(1, 10));
        System.out.println(getFactorial());
        continueFactorial();
        }

    public static void add(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
    public static void subtract(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }
    public static void multiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }
    public static void divide(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
    public static void mod(int firstNum, int secondNum) {
        System.out.println(firstNum % secondNum);
    }


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput < max && userInput > min) {
            return userInput;
        } else {
            return getInteger(1, 10);
        }
    }

    public static String getFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        return "User factorial: " + userInput;
        }

    public static String continueFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userDecision = sc.next();
        boolean confirmation = userDecision.equals("y");
        if (confirmation){
            return "User wants to continue";
        } else {
            return "The end";
        }
        // int factorial = 1;
        // for (int i = 1; i <= userInput; i++) {
        // factorial = factorial * i;
    }

}
