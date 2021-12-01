package home.chapter04classes.task25;

/**
 * Раздел "Классы и объекты"
 * Задание №25
 *
 * Создать класс описывающие Банкомат. Набор купюр, находящихся в
 * банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
 * 50, 100. Сделать методы для добавления денег в банкомат. Сделать метод,
 * снимающий деньги. С клавиатуры передается сумма денег. На экран - булевское
 * значение (операция удалась или нет). При снятии денег метод должен выводить на
 * экран каким количеством купюр и какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами - количеством купюр. Прочее - на ваше
 * усмотрение.
 */

import java.util.Scanner;

public class View {

    private String outputMessage = "БелПромХозАвтоФотоВелоМотоБанк приветствует Вас!";
    private int inputInt;

    public View () {

    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String output) {
        this.outputMessage = output;
    }

    public void out () {
        System.out.println(outputMessage);
    }

    public int in () {

        int n;
        Scanner sc = new Scanner((System.in));

        while (!sc.hasNextInt() || (n = sc.nextInt()) < 0) {
            System.out.println("Wrong data enetered. Try again.");
            sc.nextLine();
        }

        return n;
    }
}
