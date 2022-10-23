package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return super.length*2 + super.width*2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    //why can't I use these two methods??
    @Override
    public void setLength(int length) {
        super.length = length;
    }
    @Override
    public void setWidth(int width) {
        super.width = width;
    }
//    private int length;
//    private int width;
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public Rectangle() {};
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }

}
