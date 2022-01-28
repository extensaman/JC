package home.chapter15reflectionandannotation.task71;

/**
 * Раздел "Reflection API. Аннотации"
 * Задание №71
 *
 * Создайте класс с методов printHelloWorld(). Вызвать метод с помощью
 * рефлексии из основной программы.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String METHOD_NAME = "printHelloWorld";

    public static void main(String[] args) {

        HelloWorldPrinting printing = new HelloWorldPrinter();
        ReflectionMethodInvoking invoking = null;

        try {
            invoking = new ReflectionWorker(printing);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        invoking.invokeMethodByReflection(METHOD_NAME);


    }
}
