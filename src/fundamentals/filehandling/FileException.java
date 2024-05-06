package fundamentals.filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileException{
    public static final String INPUT_FILE = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\fileexception\\input.txt";
    public static void main(String[] args) {
        byte bytes[] = new byte[30];
        try(InputStream inputstream = new FileInputStream(INPUT_FILE);)
        {
            System.out.println("Available bytes from the file: " + inputstream.available());
            int a = inputstream.read();
            System.out.println("Read a byte: " +a);

            int c = inputstream.read(bytes,5,7);
            System.out.println("No of bytes that are going to be read: " +c);
            System.out.println("Read bytes: " + Arrays.toString(bytes));

        }
        catch(FileNotFoundException e1){
            e1.printStackTrace();

        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }

}

