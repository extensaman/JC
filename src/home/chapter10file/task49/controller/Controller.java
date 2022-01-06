package home.chapter10file.task49.controller;

import home.chapter10file.task49.reader.DataInputStreamReader;
import home.chapter10file.task49.reader.ReadBehavior;
import home.chapter10file.task49.reader.Reader;
import home.chapter10file.task49.service.Service;
import home.chapter10file.task49.viewer.View;
import home.chapter10file.task49.writer.DataOutputStreamWriter;
import home.chapter10file.task49.writer.WriteBehavior;
import home.chapter10file.task49.writer.Writer;

import java.io.FileNotFoundException;
import java.util.List;

public class Controller {

    public void perform (String filePath, int numbersCount, int lowNumbersLimit, int highNumbersLimit) throws FileNotFoundException {

        WriteBehavior behavior = new DataOutputStreamWriter();
        Writer writer = new Writer(behavior);

        Service service = new Service();
        List<Integer> list = service.createRandomIntegerList(numbersCount, lowNumbersLimit, highNumbersLimit);

        View view = new View();
        view.printList("Сгенерированный List из " + numbersCount + " элементов:", list);

        writer.writePerfom(filePath, list);

        ReadBehavior behavior1 = new DataInputStreamReader();
        Reader reader = new Reader(behavior1);

        list = reader.readPerfom(filePath);
        view.printListAndAverage(
                "Прочитанный из файла List:",
                list,
                service.calculateAverageFromIntegerList(list)
        );
    }
}
