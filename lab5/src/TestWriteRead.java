import org.junit.Test;

import java.io.*;

/**
 * Created by subtselnyi on 10.05.16.
 */
public class TestWriteRead {
    @Test
    public void readerwriter() {
        String line;
        boolean actual;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/home/subtselnyi/IdeaProjects/lab5/src/outputtest.txt")))) {

            writer.write("text area");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(new File("/home/subtselnyi/IdeaProjects/lab5/src/outputtest.txt")))) {
            line = reader.readLine();
            if (line.equals("text area")) {
                actual = true;
                assert (actual);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}