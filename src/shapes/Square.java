package shapes;

public class Square extends Rectangle {

    public Square(int side) {
//        super.getArea(side, side);
//        super.getPerimeter(side, side);
    }

    public int getArea(int side) {
        return side * 2;
    }

    public int getPerimeter(int side) {
        return 4 * side;
    }
}
