package home.chapter09exception.task43;

import java.util.LinkedList;

/**
 * Раздел "Исключения"
 * Задание №43
 *
 * Написать код, который выбрасывает NullPointerException. Написать обработчик
 * этого исключения и вывести на экран сообщение, которое будет содержать описание
 * данного исключения.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Entity entity = new Entity(new LinkedList<>());
        entity.push("lopata");
        entity.push("grabli");
        entity.push(null);
        entity.push("venik");
        entity.push("sovok");
        System.out.println(entity);

        entity.printAllToUpperCase();
    }
}
