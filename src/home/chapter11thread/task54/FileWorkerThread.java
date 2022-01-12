package home.chapter11thread.task54;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class FileWorkerThread extends Thread{

    public static final long ARRAY_SIZE = 10;
    public static final int LOW_BOUND = 0;
    public static final int HIGH_BOUND = 9;

    private File file;
    private int[] array;

    public FileWorkerThread(String threadName, String filePath) {
        super(threadName);
        file = new File (filePath);
    }

    @Override
    public void run() {

        array = new Random().ints(ARRAY_SIZE, LOW_BOUND, HIGH_BOUND).toArray();

        try{
            file.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
            this.interrupt();
        }

        try (DataOutputStream stream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file))))
        {
            for (int k : array) {
                stream.writeInt(k);
            }

            System.out.println(Thread.currentThread().getName()
                    + ": array "
                    + Arrays.toString(array)
                    + "has just written to file "
                    + file.getAbsolutePath());

        }
        catch (IOException e) {
            e.printStackTrace();
            this.interrupt();
        }
    }
}
