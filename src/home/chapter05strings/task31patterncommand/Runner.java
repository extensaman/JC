package home.chapter05strings.task31patterncommand;

import home.chapter05strings.task31patterncommand.controller.Command;
import home.chapter05strings.task31patterncommand.controller.Controller;
import home.chapter05strings.task31patterncommand.controller.Menu;
import home.chapter05strings.task31patterncommand.model.Model;
import home.chapter05strings.task31patterncommand.view.View;

import java.util.LinkedList;


/**
 * Раздел "Строки и регулярные выражения"
 * Задание №31
 *
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора сложения и String,
 * а другой с помощью StringBuilder и метода append.
 * Сравните скорость их выполнения. Выведите сравнение на экран.
 * (Можно использовать патерн MVC и Команда)
 */

public class Runner {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View(System.in);
        Controller controller = new Controller(new LinkedList<Command>());

        Menu menu = new Menu();
        menu.run(model, view, controller);
    }
}
