package util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Would you like to create a grocery list?");
        input.yesNo();

        ArrayList<String> categories = new ArrayList<String>(Arrays.asList("Produce", "Meat", "Breads"));
        Collections.sort(categories);
        System.out.println(categories);

//        System.out.println(input.getString());
////        System.out.println(input.yesNo());
//        System.out.println(input.getInt(1, 10));
//        System.out.println(input.getDouble(5.4, 9.2));
//        System.out.println(input.yesNo());
//        System.out.println(input.getString());
    }
}
