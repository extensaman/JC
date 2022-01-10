package home.chapter11thread.task52;

import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Service {

    public Collection<Integer> createCollectionWithRandomNumbers (int size, int lowLimit, int bound) {
        return Stream.generate(() -> new Random().nextInt(lowLimit + bound) - lowLimit)
                .limit(size)
                .collect(Collectors.toList());
    }

    public double calculateAverageOfCollection (Collection<Integer> collection)
    {
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        return collection.stream().reduce(Integer::sum)
                .map(integer -> integer / (double) collection.size()).get();
    }

}
