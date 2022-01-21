package home.chapter11thread.task60.writter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {

    private final File file;
    private BufferedWriter bw;
    private FileWriter fw;

    private final Object lock = new Lock();

    public MyWriter(String fileName) {
        this.file = new File(fileName);
    }

    public void openFile() throws IOException {

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

        try {
            bw = new BufferedWriter(fw);
        }
        catch (Exception e)
            {
                e.printStackTrace();
                throw e;
            }
        }

        public void closeFile () {

            try {
                if (bw == null) {
                    return;
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fw == null) {
                        return;
                    }
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        public void writeString (String s){

            synchronized (lock) {

                try {
                    bw.append(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private final static class Lock {
        }
    }
