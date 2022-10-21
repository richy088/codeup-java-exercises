public class Car {

    private int doors;
    private int wheels;
    private boolean engine;
    private String model;
    private String color;
    private int cylinders;

    //This is a setter (standard method in Java)
//    public void setModel(String model) {
//        String validModel = model.toLowerCase();
//        if(validModel.equals("boxster") || validModel.equals("toyota")) {
//            this.model = model;
//        } else {
//            this.model = "Unknown";
//        }
//    }

    public static void main(String[] args) {
        Car car = new Car(4, "Ford", 4, true);
        System.out.println(car.model);
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public Car (int cylinders, String model, int wheels, boolean engine) {
        this.cylinders = cylinders;
        this.model = model;
        this.wheels = 4;
        this.engine = true;
    }
}
