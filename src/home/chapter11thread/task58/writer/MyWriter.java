package home.chapter11thread.task58.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {

    private final File file;

    public MyWriter(final String fileName) {
        this.file = new File(fileName);
    }

    public void writeToFile(String[] strings) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter (file))) {

            for (String s : strings) {
                writer.append(s);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
