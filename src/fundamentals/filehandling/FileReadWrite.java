package fundamentals.filehandling;

import java.io.*;

public class FileReadWrite {
    public static final String INPUT_FILE = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\input.txt";
    public static final String OUTPUT_FILE = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\output.txt";

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            fis = new FileInputStream(INPUT_FILE);
            bis = new BufferedInputStream(fis);
            fos = new FileOutputStream(OUTPUT_FILE);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bos.flush();
            System.out.println("Data copied from input file to output file successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        } finally {
            try {
                if (bos != null) bos.close();
                if (fos != null) fos.close();
                if (bis != null) bis.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e);
            }
        }
    }
}
