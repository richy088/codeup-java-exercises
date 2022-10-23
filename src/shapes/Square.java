package shapes;

public class Square extends Quadrilateral {
    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return super.length * super.length;
    }

    @Override
    public void setLength(int length) {
        super.length = length;
    }

    @Override
    public void setWidth(int width) {
        super.width = width;

    }

//    private int side;
//
//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }
//
//    public Square(int side) {
////        super.getArea(side, side);
////        super.getPerimeter(side, side);
//        this.side = side;
//    }
//
//    public int getArea() {
//        return side * side;
//    }
//
//    public int getPerimeter() {
//        return 4 * side;
//    }
}
