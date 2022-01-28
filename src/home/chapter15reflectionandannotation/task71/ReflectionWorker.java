package home.chapter15reflectionandannotation.task71;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

public class ReflectionWorker implements ReflectionMethodInvoking{

    private final Class aClass;
    private final Object object;

    public ReflectionWorker(Object object) throws NullPointerException {
        this.object = object;
        this.aClass = object.getClass();
    }

    @Override
    public void invokeMethodByReflection(String methodName) {

        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {

            if (method.getName().equals(methodName)) {

                try {
                    System.out.println("Invoking method by reflection");
                    method.invoke(object);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}
