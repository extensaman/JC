package home.chapter10file.task49.service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Service {

    public List<Integer> createRandomIntegerList (int size, int lowNumbersLimit, int highNumbersLimit) {
        Random random = new Random(47);
        return random.ints(size, lowNumbersLimit, highNumbersLimit + 1).boxed().collect(Collectors.toList());
    }

    public double calculateAverageFromIntegerList(List<Integer> list) {

        return list.stream().reduce( (sum, next) -> sum + next ).get() / (double) list.size();

    }

}
