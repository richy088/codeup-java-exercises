package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("The area is: " + box1.getArea());
//        System.out.println("The perimeter is: " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
////        System.out.println("The perimeter is: " + box2.getPerimeter(5, 5));
////        System.out.println("The area is: " + box2.getArea(5, 5));
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

        Measurable myShape = new Rectangle();
        myShape.setLength(4);
        myShape.setWidth(5);
        System.out.println("The area of the rectangle is: " + myShape.getArea());
        System.out.println("The perimeter of the rectangle is: " + myShape.getPerimeter());
//        Measurable myShape = new Rectangle();
    }
}

// #9: we have to use getPerimeter() because it is a defined method in the interface

// #10:
