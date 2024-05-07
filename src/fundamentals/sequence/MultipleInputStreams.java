package fundamentals.sequence;

import java.io.*;

public class MultipleInputStreams {
    public static void main(String[] args) {
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        SequenceInputStream sis = null;

        try {
            fis1 = new FileInputStream("C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\sequence\\file1.txt");
            fis2 = new FileInputStream("C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\sequence\\file2.txt");

            sis = new SequenceInputStream(fis1, fis2);

            int data;
            while ((data = sis.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        } finally {
            try {
                if (sis != null) sis.close();
                if (fis1 != null) fis1.close();
                if (fis2 != null) fis2.close();
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e);
            }
        }
    }
}
