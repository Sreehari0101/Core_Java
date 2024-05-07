package fundamentals.filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadDemo {
    public static final String INPUT_FILE = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\input.txt";

    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream(INPUT_FILE)) {
            System.out.println("Available bytes from the file: " + inputStream.available());

            StringBuilder stringBuilder = new StringBuilder();
            int character;
            while ((character = inputStream.read()) != -1) {
                stringBuilder.append((char) character);
            }

            String fileContent = stringBuilder.toString();
            System.out.println("File content:\n" + fileContent);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
