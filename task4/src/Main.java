import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            StringBuilder tmpStr = new StringBuilder();
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                if(!line.isEmpty()) {
                    tmpStr.append(line).append("\n");
                } else {
                    i++;
                    writeText(tmpStr, i);
                }
                line = reader.readLine();
            }
            i++;
            writeText(tmpStr, i); //для записи завершающего абзаца
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeText(StringBuilder s, int i) {
        String outputFileName = "";
        outputFileName = "part" + Integer.toString(i) + ".txt";
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
            writter.write(s + "\n");
            s.delete(0, s.length());
            writter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}