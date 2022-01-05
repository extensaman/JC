package home.chapter10file.task50.reader;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class BufferedReaderString implements ReadBehavior {

    @Override
    public List<String> readFromFile(File file) throws FileNotFoundException {

        List<String> list = new LinkedList<>();

        try (
                BufferedReader stream = new BufferedReader(
                        new FileReader(file)

                )
        ){
            while(stream.ready()) {

                list.add(stream.readLine());
            }

        }
        catch (FileNotFoundException e) {
            throw e;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
