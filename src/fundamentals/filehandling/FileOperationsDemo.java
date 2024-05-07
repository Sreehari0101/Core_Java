package fundamentals.filehandling;
import java.io.*;

public class FileOperationsDemo {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\input.txt";
        String outputFile = "C:\\Users\\srees\\Desktop\\Core_Java\\src\\fundamentals\\filehandling\\output.txt";

        try {
            writeFile(inputFile);
            System.out.println("Data written to input file");


            copyFile(inputFile, outputFile);
            System.out.println("Data copied from input file to output file");

            readFormattedOutput(outputFile);

            searchAndReplace(outputFile, "world", "Java");
            System.out.println("Search and replace operation completed.");

        } catch (IOException e) {
            System.err.println("An IO Exception occurred: " + e.getMessage());
        }
    }

    private static void writeFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, world!\nThis is a sample text file.\nJava is fun!");
        }
    }

    private static void copyFile(String sourceFile, String destFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    private static void readFormattedOutput(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase()); // Display formatted output (e.g., uppercase)
            }
        }
    }

    private static void searchAndReplace(String fileName, String searchStr, String replaceStr) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line.replaceAll(searchStr, replaceStr)).append("\n");
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(sb.toString());
        }
    }
}
