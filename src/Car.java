public class Car {

    private int doors;
    private int wheels;
    private String engine;
    private String model;
    private String color;

    //This is a setter (standard method in Java)
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("boxster") || validModel.equals("toyota")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
