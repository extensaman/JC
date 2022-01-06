package home.chapter10file.task50.writer;

import java.io.*;
import java.util.List;

public class BufferedWriterInteger implements WriteBehavior <Integer>{
    @Override
    public void writeToFile(File file, List<Integer> list) throws FileNotFoundException {

        try (
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(file)
                );
        )
        {
            for (Integer value : list) {
                bw.append(value.toString()).append(' ');
            }
            bw.newLine();
        }
        catch (FileNotFoundException e) {
            throw e;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
