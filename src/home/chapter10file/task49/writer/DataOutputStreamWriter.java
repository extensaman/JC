package home.chapter10file.task49.writer;

import java.io.*;
import java.util.List;

public class DataOutputStreamWriter implements WriteBehavior{
    @Override
    public void writeToFile(File file, List<Integer> list) throws FileNotFoundException {

        try (
                DataOutputStream dos = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(file)
                        )
                );
        )
        {
            for (Integer integer : list) {
                    dos.writeInt(integer);
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
