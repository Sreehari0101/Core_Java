package fundamentals.sequence;

import java.io.*;

public class FilterInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\sequence\\file1.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             DataInputStream dis = new DataInputStream(bis);
             FilterInputStream fisFiltered = new FilterInputStream(dis) {
                 @Override
                 public int read() throws IOException {
                     int data;
                     while ((data = super.read()) != -1) {
                         if (Character.isAlphabetic(data)) {
                             return data;
                         }
                     }
                     return -1;
                 }
             }) {

            int filteredData;
            while ((filteredData = fisFiltered.read()) != -1) {
                System.out.print((char) filteredData);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}
