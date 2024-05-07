package fundamentals.sequence;
import java.io.*;

public class FilterOutputStreamDemo {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\sequence\\encrypted.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             FilterOutputStream fosFiltered = new FilterOutputStream(bos) {
                 @Override
                 public void write(int b) throws IOException {
                     b = (b + 3) % 256;
                     super.write(b);
                 }
             }) {
            String data = "Hello, this is a secret message!";
            byte[] bytes = data.getBytes();
            fosFiltered.write(bytes);

            System.out.println("Data encrypted and written to file.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
