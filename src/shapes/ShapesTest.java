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

        Measureable myShape = new Square();
        System.out.println(myShape.getArea());
//        Measureable myShape = new Rectangle();
    }
}
