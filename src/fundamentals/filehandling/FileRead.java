package fundamentals.filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileRead {
    public static final String INPUT_FILE = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\input.txt";

    public static void main(String[] args) {
        byte bytes[] = new byte[30];
        try (InputStream inputstream = new FileInputStream(INPUT_FILE);) {
            System.out.println("Available bytes from the file: " + inputstream.available());
            int a = inputstream.read();
            System.out.println("Read a byte: " + a);

            int c = inputstream.read(bytes, 5, 7);
            System.out.println("No of bytes that are going to be read: " + c);
            // Convert bytes to string for printing
            String readBytes = new String(Arrays.copyOfRange(bytes, 5, 5 + c));
            System.out.println("Read bytes: " + readBytes);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
