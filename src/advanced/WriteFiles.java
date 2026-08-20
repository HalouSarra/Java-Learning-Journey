package advanced;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args){
        // How to write a file using java (4 popular options)

        // FileWrite = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "src/advanced/testWrite.txt";
        String textContent1 = "I like pizza!\nIt's really good!\nBuy me pizza!";
        String textContent2 = """
                Roses are red
                Violets are Blue
                """;

        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent1);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e) {
            System.out.println("Could not write file");
        }

    }
}