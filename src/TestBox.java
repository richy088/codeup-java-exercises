public class TestBox {
    private Integer i;
    private int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        i = j;
        System.out.println(j);
        System.out.println(i);
    }
}

// Integer i = int j works
// int j = Integer i doesn't work
