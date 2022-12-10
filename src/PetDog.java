import java.util.ArrayList;
import java.util.Objects;

public class PetDog extends Pet implements Companion {
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

    @Override
    public String snuggle() {
        return this.name + " wants to snuggle";
    }

    public static void allSnuggle(ArrayList<PetDog>petDogs) {
        for (PetDog petDog : petDogs) {
            System.out.println(petDog.snuggle());
        }
    }
}
