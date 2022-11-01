public class PetDog extends Pet {
    boolean trained;

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    public PetDog(boolean trained) {
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }
}
