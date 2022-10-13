import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args) {

        //while loop that prints from 5-15
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//    }
        //do-while loop that prints 0-100 evens
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

        //do-while loop that prints from 100 to -10 decreasing by 5
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        do-while loop where i is squared each time --get 0's when while is greater than 60k?
//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 60_000);

        //Fizzbuzz
//        for(int i = 1; i < 100; i++) {
//            if (i % 3 == 0) {
//                if (i % 5 == 0) {
//                    System.out.println("Fizzbuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        //Display table of powers --TABLE IS A BIT CROOKED??
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: " + userInput);
//
//        System.out.println("Here is your table!");
//        System.out.println();
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= userInput; i++) {
//            System.out.println(i + "      |" + " " + (i*i) + "       " + "|" + " " + (i*i*i));
//        }


        // Convert given number into letter grades
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 0-100: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);

        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/N] ");
        String userDecision = sc.next();
        boolean confirmation = userDecision.equals("y");
        if (confirmation){
            if (userInput <= 100 && userInput >= 88) {
                System.out.println("You have an A");
            } else if (userInput <= 87 && userInput >= 80) {
                System.out.println("You have a B");
            } else if (userInput <= 79 && userInput >= 67) {
                System.out.println("You have a C");
            } else if (userInput <= 66 && userInput >= 60) {
                System.out.println("You have a D");
            } else {
                System.out.println("You have an F");
            }
        } else {
            System.out.println("The end");
        }

    }
}
