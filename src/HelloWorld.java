public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.print("World!");

        //Why is this connected to previous print?
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        //Only accepts with quotation marks
        String myString = "3.141519";
        System.out.println(myString);

        //Print out without the L for some reason...
        double myNumber = 3.14;
        System.out.println(myNumber);

        // x hasn't been incremented yet
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

        // x has already been incremented
        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        String class = "hello";
//        System.out.println(class);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        x += 5;
//        y *= x;
//        x /= y;
//        y -= x;


//        // #1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
//        // #2
//        Scanner wordScanner = new Scanner(System.in);
//
//        System.out.print("Enter three words: ");
//        String firstWord = wordScanner.next();
//        String secondWord = wordScanner.next();
//        String thirdWord = wordScanner.next();
//
//        System.out.println("You entered: --> \"" + firstWord + ' ' + secondWord + ' ' + thirdWord + "\" <--");
//
//        // #3
//        Scanner sentenceScanner = new Scanner(System.in);
//
//        System.out.print("Enter a sentence: ");
//        String sentence = sentenceScanner.nextLine();
//
//        System.out.println("You entered: --> \"" + sentence + "\" <--");
//
//        // Calculate the perimeter and area
//        Scanner dimensions = new Scanner(System.in);
//
//        System.out.print("Enter a length: ");
//        int length = dimensions.nextInt();
//        System.out.print("Enter a width ");
//        int width = dimensions.nextInt();
//        System.out.print("Enter a height: ");
//        int height = dimensions.nextInt();
//
//        System.out.println("The area of the room is : " + (length * width));
//        System.out.println("The perimeter of the room is: " + ((2 * length) + (2 * width)));
//        System.out.println(("The volume of the room is: ") + (length * width * height));
//
//        //Not sure how to use parse or useDelimiter method
//        // "sout" + tab = System.out.println();

//        byte byteVar = 4;
//        short shortVar = 4000;
//        int intVar = 100_000;
//        long longVar = 50_000 + (10 * (byteVar + shortVar + intVar));
//
//        System.out.println(longVar);
//
//        Scanner pounds = new Scanner(System.in);
//
//        System.out.print("How many pounds are you? ");
//
//        int weight = pounds.nextInt();
//        System.out.println("You are " + (weight * 0.453) + " kilograms in weight");

//        double num = 20.00;
//        double secondNum = 80.00;
//        double numTotal = (num + secondNum) * 100.00;
//        double numRemainder = numTotal % 40.00;
//        System.out.println(numRemainder);
//
//        if (numRemainder == 0) {
//            System.out.println("true");
//        } else {
//            System.out.println("Got some remainder");
//        }

    }

//    int highScorePosition = calculateHighScorePosition(1500);
//
//
//    public static void displayHighScorePosition(String playerName, int highScorePosition) {
//        System.out.println("Player: " + playerName + " managed to get into position: " + highScorePosition);
//    }
//
//    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore > 1000) {
//            return 1;
//        } else if (playerScore > 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore > 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }
//
//    displayHighScorePosition()
}
