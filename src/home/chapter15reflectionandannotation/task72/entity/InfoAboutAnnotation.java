package home.chapter15reflectionandannotation.task72.entity;

import java.util.Arrays;
import java.util.Objects;

public class InfoAboutAnnotation {

    private final String methodName;
    private final String[] annotationsName;

    public InfoAboutAnnotation(String methodName, String[] annotationsName) {
        this.methodName = methodName;
        this.annotationsName = annotationsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoAboutAnnotation that = (InfoAboutAnnotation) o;
        return Objects.equals(methodName, that.methodName) &&
                Arrays.equals(annotationsName, that.annotationsName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(methodName);
        result = 31 * result + Arrays.hashCode(annotationsName);
        return result;
    }

    @Override
    public String toString() {
        return "InfoAboutAnnotation{" +
                "methodName='" + methodName + '\'' +
                ", annotationsName=" + Arrays.toString(annotationsName) +
                '}';
    }
}
