package home.chapter10file.task50.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Service {

    public void createFolder (String path) {

        File file = new File(path);

        if (!file.mkdirs()) {
            if (!file.exists()){
                throw new IllegalArgumentException("Folder with path " + path + " was not created. ");
            }
        }
    }

    public File createFile (String path) {

        File file = new File(path);

        try {

            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return file.getAbsoluteFile();

    }

    public List<Integer> createRandomIntegerList (int size, int lowNumbersLimit, int highNumbersLimit) {
        Random random = new Random();
        return random.ints(size, lowNumbersLimit, highNumbersLimit + 1).boxed().collect(Collectors.toList());
    }

    public List<String> createListOfFileInDirectory(String path) {

        File file = new File(path);

        List<String> list = new ArrayList<>();


        for (String filename : file.list()) {

            if (new File(path + '/' + filename).isFile()) {
                list.add(filename);
            }
        }

        return list;
    }
}
