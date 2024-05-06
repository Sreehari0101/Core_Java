package fundamentals.filehandling;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWrite {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file;
        String mycontent = "This is my data which needs to be written into the file";
        try{
            file = new File("C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\output.txt");
            fos = new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            byte[] b = mycontent.getBytes();
            fos.write(b);
            fos.write(b);
            System.out.println("File Written Successfully");

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(fos != null){
                    fos.close();
                }
            }
            catch(IOException e){
                System.out.println("Error in closing the stream");
            }
        }

    }
}
