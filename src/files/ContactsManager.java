package files;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class ContactsManager {
    public static void main(String[] args) throws IOException {

        try {
            Path path = FileSystems.getDefault().getPath("Contacts.txt");
            List<String> data = Files.readAllLines(path);
            for(String info : data) {
                System.out.println(info);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
        Files.write(Paths.get("Contacts.txt"), Arrays.asList("Aiden" + "|" + "hello"), StandardOpenOption.APPEND);


//        Path path = FileSystems.getDefault().getPath("Contacts.txt");
//        printFile(path);
//    }
//    private static void printFile(Path path) {
//        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
//            String line;
//            while((line = fileReader.readLine()) !=null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
    }
}


