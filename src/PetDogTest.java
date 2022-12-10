import java.util.ArrayList;
import java.util.List;

public class PetDogTest {

    public static void main(String[] args) {
        PetDog miso = new PetDog("Miso", "Aussie", true);
        System.out.println(miso.snuggle());

        PetDog petDog = new PetDog("Churro", "Chihuahua", false);
        PetDog petDog1 = new PetDog("Penny", "Unknown", false);
        PetDog petDog2 = new PetDog("Nala", "Golden Retriever", true);

        ArrayList<PetDog> petDogs = new ArrayList<>(List.of(petDog, petDog1, petDog2));
        PetDog.allSnuggle(petDogs);



    }

}
