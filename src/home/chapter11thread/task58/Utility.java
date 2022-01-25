package home.chapter11thread.task58;

import home.chapter11thread.task58.writer.MyWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Utility {

    public static final String ALPHABET = "abcdefghigklmnopqrstuvwxyz";
    public static final String DEFAULT_PATH = "d:/task58/";
    public static final String DEFAULT_FILE_NAME = "task58_file_";
    public static final String DEFAULT_FILE_EXTENSION = ".txt";
    public static final int STRING_DEFAULT_LENGTH = 8;

    public static final Random RANDOM = new Random();
    public static final int DEFAULT_LINE_COUNT = 10;

    private Utility() {
    }

    public static String generateRandomString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < STRING_DEFAULT_LENGTH; i++) {
            sb.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return sb.append('\n').toString();
    }

    public static List<String> createFilesWithRandomString(final String threadName, final int filesCount) throws FileNotFoundException {

        String newDirName = createFolderForThread(threadName);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < filesCount; i++) {

            String fileName = newDirName + "/" + DEFAULT_FILE_NAME + i + DEFAULT_FILE_EXTENSION;

            MyWriter writer = new MyWriter(fileName);

            String[] strings = new String[DEFAULT_LINE_COUNT];

            for (int j = 0; j < strings.length; j++) {
                strings[j] = generateRandomString();
            }

            writer.writeToFile(strings);

            list.add(fileName);
        }
        return list;
    }

    private static String createFolderForThread(String threadName) throws FileNotFoundException {
        String newDirName = DEFAULT_PATH + threadName + "/" + new SimpleDateFormat("HH-mm-ss-S").format(new Date());
        File newDir = new File(newDirName);

        if (!newDir.mkdirs()) {
            throw new FileNotFoundException();
        }
        return newDirName;
    }
}
