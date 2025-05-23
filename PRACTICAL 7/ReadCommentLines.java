import java.io.*;

public class ReadCommentLines {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("//")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}