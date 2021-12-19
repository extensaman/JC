package home.chapter09exception.task44;

/**
 * Раздел "Исключения"
 * Задание №44
 *
 * Написать собственное искnючение от Exception. Сгенерировать код, который
 * будет выбрасывать его и обрабатывать. Результат работы программы вывести на
 * экран.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        OverdraftAI ai = new OverdraftAI("Donald John Trump");
        ai.setGoodHistory(true);
        ai.setPersonValided(true);

        try {

            ai.acceptOverdraft();

        } catch (OverdraftAIException e){
            System.out.println(e);
        }

    }
}
