package home.chapter10file.task48.service;

import java.io.IOException;
import java.util.List;

public interface FileNumberServiceBehavior {

    List<String> readTextFromFile(String path) throws IOException;
    public <T> void printList(List<T> list);
    String inputLine();
    List<Integer> recognizeIntegersInText (List<String> list, String regex);
    public int sumArrayElements (List<Integer> ints);
    public void deleteRepeatElements (List<Integer> list);
}
