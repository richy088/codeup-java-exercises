import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Person = {Person("Richard"), Person("Monica"), Person("Natasha")};
        for (String persons : Person) {
            System.out.println(persons);
        }
    }

    public static String Person(String person) {
        return person;
    }

}
