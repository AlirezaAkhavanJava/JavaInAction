import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriteItUp {
    private final File direction = new File("/mnt/hdd/Home/temp-files/fly.txt");

    private String read() throws IOException {
        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(direction), StandardCharsets.UTF_8))) {

            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append('\n');
            }
        }
        return builder.toString();
    }


    public void operate() {
        try {
            System.out.println(read());
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
