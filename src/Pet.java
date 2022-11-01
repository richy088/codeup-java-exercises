public class Pet {
    String name;
    String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Pet(){};
}
