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

public class Controller {

    public static final int TWENTY_INDEX = 0;
    public static final int FIFTY_INDEX = 1;
    public static final int HUNDRED_INDEX = 2;

    private Model model;
    private View view;

    public Controller () {

        model = Model.getInstance();
        view = new View();
        view.out();
    }

    public Controller (int ... cash) {
        this();
        this.loadCash(cash);
    }

    // метод, выводящий на экран меню работы с банкоматом
    public void run () {

        do {
            printMessage("Menu:\n0 - выход\n1 - показать остаток денег в банкомате\n2 - снять наличные");

            int choice = view.in();

            switch (choice){
                case 0:
                    return;
                case 1:
                    printBalance();
                    break;
                case 2:

                    printMessage("Сколько хотите снять денег?");
                    int request = view.in();

                    String result = withdrawCash(request);

                    printMessage(result);
                    break;
            }
        } while (true);

    }

    // заругзка денег в банкомат
    // 1 - ый параметр - количесво двадцаток
    // 2 - ой параметр - кол-во пятидесяток
    // 3 - ий параметр - кол-во соток
    // остальные параметры не учитываются
    public void loadCash (int ... cash) {

        if (cash.length > 0 && cash[TWENTY_INDEX] > 0) {

            model.setCount20(model.getCount20() + cash[TWENTY_INDEX]);
        }

        if (cash.length > 1 && cash[FIFTY_INDEX] > 0) {

            model.setCount50(model.getCount50() + cash[FIFTY_INDEX]);
        }

        if (cash.length > 2 && cash[HUNDRED_INDEX] > 0) {

            model.setCount100(model.getCount100() + cash[HUNDRED_INDEX]);
        }
    }

    // вывод на экран остатка денег в банкомате
    public void printBalance () {

        StringBuffer str = new StringBuffer("\nБаланс: ");
        str.append(model.getCount20() * Model.TWENTY + model.getCount50() * Model.FIFTY + model.getCount100() * Model.HUNDRED);
        str.append(" руб.\n");
        str.append("Количество купюр номиналом 20 руб.: " + model.getCount20());
        str.append("\nКоличество купюр номиналом 50 руб.: " + model.getCount50());
        str.append("\nКоличество купюр номиналом 100 руб.: " + model.getCount100());
        printMessage(str.toString());
    }

    // вывод сообщения через объект класса View
    public void printMessage (String message) {
        view.setOutputMessage(message);
        view.out();
    }

    // Возвращает сообщение по результатам запроса на снияте суммы денег reauest
    public String withdrawCash (int request) {

        int request20, request50, request100;

        request100 = request / Model.HUNDRED;
        if (request100 > model.getCount100()) {
            request100 = model.getCount100();
        }

        request -= request100 * Model.HUNDRED;

        request50 = request / Model.FIFTY;
        if (request50 > model.getCount50()) {
            request50 = model.getCount50();
        }

        request -= request50 * Model.FIFTY;

        request20 = request / Model.TWENTY;
        if (request20 > model.getCount20()) {
            request20 = model.getCount20();
        }

        request -= request20 * Model.TWENTY;

        if (request == 0) {
            model.setCount100(model.getCount100() - request100);
            model.setCount50(model.getCount50() - request50);
            model.setCount20(model.getCount20() - request20);
            return "Возьмите деньги:\n" + request100 + " купюр номиналом " + Model.HUNDRED + " руб.\n" +
                    request50 + " купюр номиналом " + Model.FIFTY + " руб.\n" +
                    request20 + " купюр номиналом " + Model.TWENTY + " руб.\n";
        } else {
            return "Снятие такой суммы невозможно";
        }
    }
}
