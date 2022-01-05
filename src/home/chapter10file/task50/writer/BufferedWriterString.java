package home.chapter10file.task50.writer;

import java.io.*;
import java.util.List;

public class BufferedWriterString implements WriteBehavior <String>{
    @Override
    public void writeToFile(File file, List<String> list) throws FileNotFoundException {

        try (
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(file)
                );
        )
        {
            for (String value : list) {
                bw.append(value);
                bw.newLine();
            }
        }
        catch (FileNotFoundException e) {
            throw e;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
