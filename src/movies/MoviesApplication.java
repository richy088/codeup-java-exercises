package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        printMenu();
        int choice = input.getInt("Enter your choice");
        while (choice != 0) {
            switch (choice) {
                case 0:
                    break;
                    //break will come out of the while loop
                case 1:
                    printArray(MoviesArray.findAll());
                case 2:
                case 3:
                case 4:
                case 5:
            }
            printMenu();
            choice = input.getInt("Enter your choice");
        }
    }

    private static void printArray(Movie[] all) {
        for (Movie movie: all ) {
            System.out.println(movie);
        }
    }

    private static void printMenu () {
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in drama category");
        System.out.println("4 - view movies in horror category");
        System.out.println("5 - view movies in the scifi category");
    }
}
