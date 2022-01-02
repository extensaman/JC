package home.chapter08collection.task42.entity;

import java.util.Map;

public class Result {

    private Map<String, Integer> m;

    public Result(Map<String, Integer> m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Result{" +
                "m=" + m +
                '}';
    }
}
