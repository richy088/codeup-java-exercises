import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Person = {Person("Richard"), Person("Monica"), Person("Natasha")};
        for (String persons : Person) {
            System.out.println(persons);

            //This works
//            int arr[] = {1,2,3,4,5,6};
//            int n = arr.length;
//            int newArr[] = new int[n+1];
//            int value = 7;
//            System.out.println(Arrays.toString(arr));
//            for(int i = 0; i<n; i++) {
//                newArr[i] = arr[i];
//            }
//            newArr[n] = value;
//            System.out.println(Arrays.toString(newArr));

            String array[] = {"Richard", "Monica", "Natasha"};
            int n = array.length;
            String newArray[] = new String[n+1];
            String value = "Rachel";
            System.out.println(Arrays.toString(array));
            for(int i = 0; i < n; i++) {
                newArray[i] = array[i];
            }
            newArray[n] = value;
            System.out.println(Arrays.toString(newArray));
        }
    }
//        int n = 5;
//        int i;
//
//        int array[] = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(array));
//
//        int x = 6;
//        array = addNum(n, array, x);
//        System.out.println(Arrays.toString(array));

//        }
//    }

    public static String Person(String person) {
        return person;
    }

//    public static String[] addPerson(String array[], String person) {
//        return array;
//    }

}
