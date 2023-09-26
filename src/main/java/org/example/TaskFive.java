package org.example;

import java.util.Iterator;
import java.util.stream.Stream;

public class TaskFive {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> result = Stream.builder();
        Iterator<T> itFirst = first.iterator();
        Iterator<T> itSecond = second.iterator();

        while (itFirst.hasNext() && itSecond.hasNext()) {
            result.accept(itFirst.next());
            result.accept(itSecond.next());
        }

        return result.build();
    }
}
