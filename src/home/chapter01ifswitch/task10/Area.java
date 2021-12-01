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

public class Area {

    private int biggerSide;
    private int lessSide;

    Area(int side01, int side02) {

        if (side01 < 0) {
            side01 = 0;
        }

        if (side02 < 0) {
            side02 = 0;
        }

        if(side01 > side02) {

            biggerSide = side01;
            lessSide = side02;

        } else {

            biggerSide = side02;
            lessSide = side01;
        }

    }

    public int getBiggerSide() {
        return biggerSide;
    }

    public int getLessSide() {
        return lessSide;
    }

    @Override
    public String toString() {
        return "{" +
                "biggerSide=" + biggerSide +
                ", lessSide=" + lessSide +
                '}';
    }
}
