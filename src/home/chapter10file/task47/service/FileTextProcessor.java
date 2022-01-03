package home.chapter10file.task47.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTextProcessor implements FileTextProcessorBehavior {

    public List<String> readTextFromFile(String path) throws IOException{

        List<String> list = new ArrayList<>();

        File file = new File(path);

        FileReader reader = null;
        BufferedReader stream = null;

        try {

            reader = new FileReader(file);
            stream = new BufferedReader(reader);

            while (stream.ready()) {
                list.add(stream.readLine());
            }

        } catch (IOException e) {
            throw e;
        }
        finally {

            if (stream != null) {
                stream.close();
            }

            if (reader != null) {
                reader.close();
            }
        }

        return list;
    }

    public void printList(List<String> list) {

        for (String str : list) {
            System.out.println(str);
        }
    }

    public String inputLine () {

        Scanner sc = null;

        try {
            sc = new Scanner (System.in);
            return sc.nextLine();
        }
        catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public int calculateMatches (List<String> list, String regex) {

        int result = 0;
        Pattern p = Pattern.compile(regex);

        for (String line : list) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                result++;
            }
        }

        return result;
    }
}
