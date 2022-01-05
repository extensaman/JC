package home.chapter10file.task50.controller;

import home.chapter10file.task50.reader.BufferedReaderString;
import home.chapter10file.task50.reader.ReadBehavior;
import home.chapter10file.task50.reader.Reader;
import home.chapter10file.task50.service.Service;
import home.chapter10file.task50.writer.BufferedWriterInteger;
import home.chapter10file.task50.writer.BufferedWriterString;
import home.chapter10file.task50.writer.WriteBehavior;
import home.chapter10file.task50.writer.Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Controller {

    public void perform (String folderPath,
                         int filesCount,
                         String fileNameSample,
                         int listSize,
                         int lowNumbersLimitInList,
                         int highNumbersLimitInList,
                         String combineFileName,
                         String fileNameForFolderFilesList) {

        Service service = new Service();
        try {
            service.createFolder(folderPath);
        }
        catch (IllegalArgumentException e) {
            System.err.println(e + "Try to change folder's path");
            return;
        }


        File[] files = new File[filesCount];

        WriteBehavior behavior = new BufferedWriterInteger();
        Writer writer = new Writer(behavior);

        for (int i = 0; i < files.length; i++) {

            files[i] = service.createFile(folderPath + '/' + fileNameSample + i + ".txt");
            List<Integer> list = service.createRandomIntegerList(listSize, lowNumbersLimitInList, highNumbersLimitInList);
            try {
                writer.writePerform(files[i], list);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        File combineFile = service.createFile(folderPath + '/' + combineFileName);

        ReadBehavior behavior1 = new BufferedReaderString();
        Reader reader = new Reader(behavior1);

        List<String> combineList = new LinkedList<>();
        List<String> fileBuffer = null;

        for (int i = 0; i < files.length; i++) {

            try {
                fileBuffer = reader.readPerfom(files[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            combineList.addAll(fileBuffer);
        }


        writer.setWritterBehavior(new BufferedWriterString());

        try {
            writer.writePerform(combineFile, combineList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> list = service.createListOfFileInDirectory(folderPath);
        File fileForFolderFilesList = service.createFile(folderPath + '/' + fileNameForFolderFilesList);

        try {
            writer.writePerform(fileForFolderFilesList, list);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
