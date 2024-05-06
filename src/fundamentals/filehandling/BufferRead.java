package fundamentals.filehandling;
import java.io.*;

public class BufferRead {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            File file = new File("C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\input.txt");
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            while (bis.available() > 0) {
                System.out.println((char)bis.read());
            }
        }
        catch(FileNotFoundException e1){
            System.out.println("The file not found: " +e1);
        }
        catch(IOException e2){
            System.out.println("io exception: " +e2);
        }
        finally{
            try{
                if(bis != null && fis != null){
                    bis.close();
                    fis.close();
                }
            }
            catch(IOException e3){
                System.out.println("unable to close: " +e3);

            }
        }
    }
}