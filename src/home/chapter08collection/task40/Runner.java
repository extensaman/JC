package home.chapter08collection.task40;

/**
 * Раздел "Коллекции"
 * Задание №40
 *
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить
 * повторяющиеся числа.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Logic logic = new Logic();
        Entity entity = new Entity(logic.generateList(MagicNumbers.DEFAULT_LIST_SIZE.getValue()));
        System.out.println("Сгенерированная коллекция:\n" + entity);
        logic.deleteRepeatElementsFromListByUsingFor(entity);
        System.out.println("Коллекция без повторяющихся элементов:\n" + entity);
    }
}
