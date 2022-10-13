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
            return 0;
        }
    }
}
