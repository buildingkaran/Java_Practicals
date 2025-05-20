import java.io.*;

public class CopyFileArgs {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide source and destination file names.");
            return;
        }

        String source = args[0];
        String destination = args[1];

        try (
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination)
        ) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("Content copied from " + source + " to " + destination);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}