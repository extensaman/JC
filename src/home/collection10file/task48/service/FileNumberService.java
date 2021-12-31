package home.collection10file.task48.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNumberService implements FileNumberServiceBehavior{

    @Override
    public List<String> readTextFromFile(String path) throws IOException {

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

    @Override
    public <T> void printList(List<T> list) {

        for (T str : list) {
            System.out.println(str);
        }
    }


    @Override
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

    @Override
    public List<Integer> recognizeIntegersInText (List<String> list, String regex) {

        int result = 0;
        Pattern p = Pattern.compile(regex);

        List<Integer> integers = new LinkedList<>();

        for (String line : list) {
            Matcher m = p.matcher(line);

            while (m.find()) {
                try {
                    integers.add(Integer.parseInt(m.group()));
                } catch (NumberFormatException e) {
                    continue;
                }
            }
        }

        return integers;
    }

    @Override
    public int sumArrayElements (List<Integer> ints) {

        int sum = 0;
        for (Integer n : ints) {
            sum += n;
        }
        return sum;
    }

    @Override
    public void deleteRepeatElements (List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j--);
                }
            }
        }
    }
}
