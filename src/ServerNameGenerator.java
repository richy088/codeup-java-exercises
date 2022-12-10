import java.util.Random;

public class ServerNameGenerator {

    private static String[] adjectives = {"pretty", "sad", "averages", "blue", "better", "ashamed", "awful", "bloody", "bad", "black"};
    private static String[] nouns = {"airport", "ambulance", "answer", "animal", "guitar", "hair", "burger", "piano", "pillow", "pizza"};

    private static String getRandomElement(String[]input) {
//        int random = new Random().nextInt(input.length);
        int random = (int) (Math.random() * 10);
        return input[random];

    }

    public static void main(String[] args) {
        String randomAdj = getRandomElement(adjectives);
        String randomNoun = getRandomElement(nouns);
        String combinedName = randomAdj + "-" + randomNoun;
        System.out.println(combinedName);


    }
}
