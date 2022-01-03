package home.chapter10file.task47.service;

import java.io.IOException;
import java.util.List;

public interface FileTextProcessorBehavior {

    List<String> readTextFromFile(String path) throws IOException;
    void printList(List<String> list);
    String inputLine();
    int calculateMatches (List<String> list, String regex);
}
