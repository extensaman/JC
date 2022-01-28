package home.chapter15reflectionandannotation.task70.logic;

import home.chapter15reflectionandannotation.task70.view.View;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReflectionProcessor implements ClassInfoGetting, CompareToCalling {

    private final Object object;
    private final Class aClass;

    public ReflectionProcessor(Object object) {
        this.object = object;
        this.aClass = object.getClass();
    }

    @Override
    public String getClassInfo() {
        return aClass.getName();
    }

    @Override
    public List<String> getInterfaceInfo() {
        return Stream.of(aClass.getInterfaces())
                .map(Class::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getFieldInfo() {
        return Stream.of(aClass.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getMethodInfo() {
        return Stream.of(aClass.getDeclaredMethods())
                .map(Method::getName)
                .collect(Collectors.toList());
    }

    @Override
    public void compareToCall(Object man2) {

        if (man2 == null) {
            return;
        }
        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {

            if (declaredMethod.getName().equals("compareTo")) {

                View.printMessageAndString("COMPARE_TO Man: ", object.toString());
                View.printMessageAndString(" AND\n Man2: ", man2.toString());
                Integer result = null;

                try {
                    result = (Integer) declaredMethod.invoke(object, man2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }

                if (result != null) {
                    View.printMessageAndString(" IS ", result.toString());
                }
                break;
            }
        }
    }
}
