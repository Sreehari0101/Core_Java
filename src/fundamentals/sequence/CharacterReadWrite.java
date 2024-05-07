package fundamentals.sequence;

import java.io.*;

public class CharacterReadWrite {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\sequence\\file1.txt";
        String outputFile = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\sequence\\file2.txt";

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Character data copied from input file to output file successfully");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
