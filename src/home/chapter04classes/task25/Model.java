package home.chapter04classes.task25;

/**
 * Раздел "Классы и объекты"
 * Задание №25
 *
 * Создать класс описывающие Банкомат. Набор купюр, находящихся в
 * банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
 * 50, 1 00. Сделать методы для добавления денег в банкомат. Сделать метод,
 * снимающий деньги. С клавиатуры передается сумма денег. На экран - булевское
 * значение (операция удалась или нет). При снятии денег метод должен выводить на
 * экран каким кол ичеством куп юр и какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами - количеством купюр. Прочее - на ваше
 * усмотрение.
 */


// Класс нашей сущности (банкомата)
public class Model {

    public static final int TWENTY = 20;
    public static final int FIFTY = 50;
    public static final int HUNDRED = 100;

    private static Model instance = new Model();

    private Model () {

        count20 = 0;
        count50 = 0;
        count100 = 0;
    }

    private int count20;
    private int count50;
    private int count100;

    public static Model getInstance () {

        return instance;
    }

    public int getCount20() {
        return count20;
    }

    public void setCount20(int count20) {
        this.count20 = count20;
    }

    public int getCount50() {
        return count50;
    }

    public void setCount50(int count50) {
        this.count50 = count50;
    }

    public int getCount100() {
        return count100;
    }

    public void setCount100(int count100) {
        this.count100 = count100;
    }
}
