package fundamentals.filehandling;
import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\output.txt");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        if(file.exists()){
            System.out.println("File Exists");
            byte[] b = {'H','E','L','L','O', ' ' ,'W','O','R','L','D'};
            bos.write(b);
            bos.flush();
            bos.close();
        }
        else{
            System.out.println("File Not Found");
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        int c = 0;
        while((c = bis.read()) != -1)
            System.out.print((char)c);

    }

}
