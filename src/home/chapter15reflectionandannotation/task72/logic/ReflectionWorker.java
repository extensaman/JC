package home.chapter15reflectionandannotation.task72.logic;

import home.chapter15reflectionandannotation.task72.AcademyInfo;
import home.chapter15reflectionandannotation.task72.entity.Entity;
import home.chapter15reflectionandannotation.task72.entity.InfoAboutAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionWorker {

    private Class aClass;

    public ReflectionWorker(Object o) {
        this.aClass = o.getClass();
    }

    public List<InfoAboutAnnotation> formInfoAboutAnnotation() {

        Method[] methods = aClass.getDeclaredMethods();
        List<InfoAboutAnnotation> list = new ArrayList<>();

        for (Method method : methods) {

            String methodName = method.getName();

            Annotation[] annotations = method.getDeclaredAnnotations();

            String[] annotationsName = new String[annotations.length];

            for (int i =0; i < annotations.length; i++) {

                annotationsName[i] = annotations[i].annotationType().getName();
            }
            list.add(new InfoAboutAnnotation(methodName, annotationsName));
        }
        return list;
    }

}
