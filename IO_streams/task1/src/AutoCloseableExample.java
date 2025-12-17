import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableExample implements AutoCloseable {
    private BufferedReader reader;

    public AutoCloseableExample(String filePath) throws IOException {
        this.reader = new BufferedReader(new FileReader(filePath));
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }

    @Override
    public void close() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }

    static void main(String[] args) {
        String filePath = "example.txt";

        // Используем try-with-resources для автоматического закрытия ресурса
        try (AutoCloseableExample example = new AutoCloseableExample(filePath)) {
            String line;
            while ((line = example.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
