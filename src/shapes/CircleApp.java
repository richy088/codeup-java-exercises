package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
     Input input = new Input();
     Circle circle = new Circle(input.getDouble("Enter a radius: "));
        System.out.println("The area is: " + circle.getArea());
        System.out.println("The circumference is: " + circle.getCircumference());
    }
}
