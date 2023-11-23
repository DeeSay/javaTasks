import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            String line = reader.readLine();
            while (line != null) {
                queue.add(line);
                line = reader.readLine();
            }
            printTextWithDelay(queue);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printTextWithDelay(Queue queue) throws InterruptedException {
        Random random = new Random();
        try {
            if (queue.poll() != null) {
                String tmp;
                while ((tmp = (String) queue.poll()) != null) {
                    Thread.sleep(random.nextInt(2000) + 1000);
                    System.out.println(tmp);
                }
            } else {
                System.out.println("Очередь пустая.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}