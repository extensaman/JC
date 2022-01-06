package home.chapter10file.task01notfrombook.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Service {

    public String searchMostFrequentlyKey(Map<String, Integer> map) {

        int max = 0;
        String mostRepeatingWord = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                mostRepeatingWord = entry.getKey();
            }
        }
        return mostRepeatingWord;
    }

    public Map<String, Integer> createMapFromFile(String filePath) {

        File file = new File(filePath);
        Map<String, Integer> map = new HashMap<>();

        try (
                BufferedReader reader = new BufferedReader(
                        new FileReader(file)
                );
        ) {
            while (reader.ready()) {
                String key = reader.readLine();

                Integer value = map.get(key);
                map.put(key, (value == null) ? 1 : value + 1);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

    public void printResult(String mostFrequentlyKey) {
        if (mostFrequentlyKey != null) {
            System.out.println("Most repeating word is " + mostFrequentlyKey);
        } else {
            System.out.println("File is empty or doesn't exist");
        }
    }
}
