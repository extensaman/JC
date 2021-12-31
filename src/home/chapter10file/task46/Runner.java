package home.chapter10file.task46;

import home.chapter10file.task46.view.View;

import java.io.File;
import java.util.Arrays;

/**
 * Раздел "Работа с файлами"
 * Задание №46
 *
 * Вывести список файлов и каталогов выбранного каталога на диске.
 * Файлы и каталоги должны быть распечатаны отдельно.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите путь к папке (или \"//\" для выхода): ");
            String path = View.inputLine();

            if (path.equals("//")) break;

            File file = new File (path);
            String[] fullDirectoryList = file.list();

            if (fullDirectoryList == null) {
                System.out.println("Введен несуществующий путь. Попробуйте опять");
                continue;
            }

            Arrays.sort(fullDirectoryList, String.CASE_INSENSITIVE_ORDER);

            String[] onlyFileList = new String[fullDirectoryList.length];

            for (int i = 0; i < onlyFileList.length; i++) {

                File tempFile = new File(path + "/" + fullDirectoryList[i]);

                if (tempFile.isFile()) {
                    onlyFileList[i] = fullDirectoryList[i];
                }
            }

            System.out.println("--== Список папок ==-- ");
            for (int i = 0; i < fullDirectoryList.length; i++) {
                if (onlyFileList[i] == null) {
                    System.out.println(fullDirectoryList[i]);
                }
            }

            System.out.println("--== Список файлов ==-- ");
            for (int i = 0; i < fullDirectoryList.length; i++) {
                if (onlyFileList[i] != null) {
                    System.out.println(fullDirectoryList[i]);
                }
            }

        }
    }
}
