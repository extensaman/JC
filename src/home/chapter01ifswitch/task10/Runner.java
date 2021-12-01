package home.chapter01ifswitch.task10;

/**
 * Раздел "Операторы if/switch"
 * Задание №10
 *
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
 * Проверить, помещаются ли эти дома на данном участке.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {
        Area region = new Area(3,3);
        Area house01 = new Area(2,2);
        Area house02 = new Area(2,2);

        System.out.println("House01 " + house01);
        System.out.println("House02 " + house02);
        if (Processor.isAccommodate(region,house01,house02)) {

            System.out.println("accommodate to");
        } else {

            System.out.println("aren't accommodate to");
        }
        System.out.println("Region " + region);
    }

}
