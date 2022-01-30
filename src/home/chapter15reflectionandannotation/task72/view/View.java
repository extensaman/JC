package home.chapter15reflectionandannotation.task72.view;

import home.chapter15reflectionandannotation.task72.entity.InfoAboutAnnotation;

import java.util.List;

public class View {

    private View(){}

    public static void printListInfoAboutAnnotation(List<InfoAboutAnnotation> list) {
        for(InfoAboutAnnotation info : list) {
            System.out.println(info);
        }
    }
}
