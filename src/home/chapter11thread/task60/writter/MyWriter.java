package home.chapter11thread.task60.writter;

import java.io.*;

public class MyWriter {

    private final File file;
    private BufferedWriter bw;
    private FileWriter fw;

    private final Object lock = new Lock();

    public MyWriter(String fileName) {
        this.file = new File(fileName);
    }

    public void openFile() throws Exception {

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
                closeWriter(fw);
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
                closeWriter(fw);
            }
        }

        private void closeWriter(Writer stream) {
            try {
                if (stream == null) {
                    return;
                }
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
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
