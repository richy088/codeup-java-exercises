package Vehicles;

public class Vehicle {

    private String name;

    public void makeNoise() {
        System.out.println("vroom vroom");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
