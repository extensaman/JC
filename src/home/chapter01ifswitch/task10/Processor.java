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

public class Processor {

    public static boolean isAccommodate (Area region, Area house01, Area house02) {

         return (
                	region.getBiggerSide()
                    >=
                    (
                    	(house01.getBiggerSide() > house02.getBiggerSide()) ?
                        house01.getBiggerSide() :
                        house02.getBiggerSide()
                    )
                )
                &&
                (
                	region.getLessSide() >= house01.getLessSide() + house02.getLessSide()
                	
                );
        
    }
}
