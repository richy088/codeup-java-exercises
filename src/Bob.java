import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Say something to Bob: ");
        String userInput = scanner.nextLine();
        if (userInput.trim().endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.trim().endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }
    }
}
