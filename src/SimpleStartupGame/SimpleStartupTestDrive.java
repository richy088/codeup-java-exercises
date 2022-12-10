package SimpleStartupGame;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup startupLocation = new SimpleStartup();
        int shipLocation = (int) (Math.random() * 8);
        int[] locations = {shipLocation, shipLocation + 1, shipLocation + 2};
        System.out.println(Arrays.toString(locations));
        startupLocation.setLocationCells(locations);
        int userGuess;
        int userGuesses = 0;
        boolean startupIsAlive = true;
        while (startupIsAlive) {
            System.out.println("Enter a number between 1-10");
            Scanner scanner = new Scanner(System.in);
            userGuess = scanner.nextInt();
            String result = startupLocation.checkYourself(userGuess);
            userGuesses++;
            System.out.println("User has guessed: " + userGuesses + " times");
        }
    }
}
