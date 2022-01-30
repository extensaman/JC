package home.chapter15reflectionandannotation.task72.entity;

import home.chapter15reflectionandannotation.task72.AcademyInfo;

public class Entity {

    @AcademyInfo(year = 1997)
    protected void methodAnnotation(){
        System.out.println("Method with annotation invoked");
    }

    protected void methodWithoutAnnotation(){
        System.out.println("Method without annotation invoked");
    }
}
