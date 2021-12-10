package home.chapter05strings.task31.view;

import home.chapter05strings.task31.entity.Entity;

public class View {

    public static void viewResult(double stringConcatTime, double stringBufferAppendTime, Entity entity, int cyclesCount) {
        System.out.println(cyclesCount +
                " плюсовых конкатенаций строки \"" + entity + "\" происходят за " +
                stringConcatTime + " наносекунд");

        System.out.println(cyclesCount +
                " append-ов \"" + entity + "\" происходят за " +
                stringBufferAppendTime + " наносекунд");

        System.out.println("StringBuffer производительнее String в " +
                (stringConcatTime / stringBufferAppendTime) + " раз");
    }
}
