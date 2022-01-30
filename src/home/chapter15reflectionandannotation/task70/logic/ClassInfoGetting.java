package home.chapter15reflectionandannotation.task70.logic;

import java.util.List;

public interface ClassInfoGetting {
    String getClassInfo();
    List<String> getInterfaceInfo();
    List<String> getFieldInfo();
    List<String> getMethodInfo();
}
