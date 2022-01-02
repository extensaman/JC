package home.chapter08collection.task42.logic;

import home.chapter08collection.task42.entity.Data;
import home.chapter08collection.task42.entity.Result;

import java.util.HashMap;
import java.util.Map;

public class ResultMaker {

    public static Result makeResult (String[] strings) {

        Map<String, Integer> m = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {

            if(m.containsKey(strings[i])) {

                Integer temp = m.get(strings[i]);
                m.put(strings[i], temp + 1);

            } else {

                m.put(strings[i], 1);
            }
        }

        return new Result(m);
    }
}
