package home.chapter11thread.task60.writter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyWritter {

    private final File file;
    private BufferedWriter bw;
    private FileWriter fw;

    public MyWritter(String fileName) {
        this.file = new File(fileName);
    }

    public boolean openFile(){

        try {
            fw = new FileWriter(file);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }

        bw = new BufferedWriter(fw);

        return true;
    }

    public void closeFile() {

        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeString(String s) {

        try {
            bw.append(s);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
