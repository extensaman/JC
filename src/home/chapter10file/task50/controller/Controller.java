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

    private final Service service;
    private Writer writer;
    private Reader reader;

    public Controller(Service service) {
        this.service = service;
    }

    public void perform (String folderPath,
                         int filesCount,
                         String fileNameSample,
                         String fileNameSampleExtension,
                         int listSize,
                         int lowNumbersLimitInList,
                         int highNumbersLimitInList,
                         String combineFileName,
                         String fileNameForFolderFilesList)
    {

        try {
            service.createFolder(folderPath);
        }
        catch (IllegalArgumentException e) {
            System.err.println(e + "Try to change folder's path");
            return;
        }

        File[] files = createAndWriteToFiles(folderPath, fileNameSample, fileNameSampleExtension, listSize, lowNumbersLimitInList, highNumbersLimitInList, filesCount);

        File combineFile = service.createFile(folderPath + '/' + combineFileName);

        readFromFilesAndWriteToOneFile(combineFile, files);

        createFileForFolderFileList(folderPath, fileNameForFolderFilesList);
    }

    private void createFileForFolderFileList(String folderPath, String fileNameForFolderFilesList) {
        List<String> list = service.createListOfFileInDirectory(folderPath);
        File fileForFolderFilesList = service.createFile(folderPath + '/' + fileNameForFolderFilesList);

        try {
            writer.writePerform(fileForFolderFilesList, list);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void readFromFilesAndWriteToOneFile(File combineFile, File[] files) {

        ReadBehavior behavior1 = new BufferedReaderString();
        reader = new Reader(behavior1);

        List<String> combineList = new LinkedList<>();
        List<String> fileBuffer = null;

        for (File file : files) {

            try {
                fileBuffer = reader.readPerform(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (fileBuffer != null) {
                combineList.addAll(fileBuffer);
            }
        }

        writer.setWritterBehavior(new BufferedWriterString());

        try {
            writer.writePerform(combineFile, combineList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        };
    }

    private File[] createAndWriteToFiles(String folderPath, String fileNameSample, String fileNameSampleExtension, int listSize, int lowNumbersLimitInList, int highNumbersLimitInList, int filesCount) {

        File[] files = new File[filesCount];

        WriteBehavior behavior = new BufferedWriterInteger();
        writer = new Writer(behavior);

        for (int i = 0; i < files.length; i++) {

            files[i] = service.createFile(folderPath + '/' + fileNameSample + i + fileNameSampleExtension);
            List<Integer> list = service.createRandomIntegerList(listSize, lowNumbersLimitInList, highNumbersLimitInList);
            try {
                writer.writePerform(files[i], list);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return files;
    }
}
