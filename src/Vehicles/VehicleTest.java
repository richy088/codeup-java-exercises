package Vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle genericCar = new Vehicle();
        genericCar.makeNoise();
        Trucks ford = new Trucks();
        ford.makeNoise();
    }
}
