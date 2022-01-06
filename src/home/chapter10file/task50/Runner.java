package home.chapter10file.task50;

/**
 * Раздел "Работа с файлами"
 * Задание №50
 *
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных
 * текстовых файлов. Заполнить их 1О произвольными целыми числами. Содержимое
 * файлов записать в один файл в том же каталоге. Создать файл, который будет
 * содержать список файлов данного каталога.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

import home.chapter10file.task50.controller.Controller;
import home.chapter10file.task50.service.Service;

public class Runner {

    public static final String FOLDER_PATH = "d:/first/second/third";
    public static final int FILES_COUNT = 10;
    public static final String FILE_NAME_SAMPLE = "generatedFile";
    public static final String FILE_NAME_SAMPLE_EXTENSION = ".txt";
    public static final int LIST_SIZE = 5;
    public static final int LOW_NUMBERS_LIMIT_IN_LIST = 1;
    public static final int HIGH_NUMBERS_LIMIT_IN_LIST = 10;
    public static final String COMBINE_FILE_NAME = "combinedFile.txt";
    public static final String FILE_NAME_FOR_FOLDER_FILES_LIST = "folderFilesList.txt";

    public static void main(String[] args) {

        Controller controller = new Controller(new Service());

        controller.perform(
                FOLDER_PATH,
                FILES_COUNT,
                FILE_NAME_SAMPLE,
                FILE_NAME_SAMPLE_EXTENSION,
                LIST_SIZE,
                LOW_NUMBERS_LIMIT_IN_LIST,
                HIGH_NUMBERS_LIMIT_IN_LIST,
                COMBINE_FILE_NAME,
                FILE_NAME_FOR_FOLDER_FILES_LIST);
    }
}
