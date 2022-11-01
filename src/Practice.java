public class Practice {

    public static int subtractTen(int num) {
        return num - 10;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println(average(new int[]{2, 3, 4}));
        System.out.println(subtractTen(20));
    }
}
