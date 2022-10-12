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

        //do-while loop where i is squared each time --NOT COMPLETE
        int i = 2;
        do {
            System.out.println(i);
            i *= i;
        } while (i < 1_000_000);
    }
}
