package org.example;

import java.util.stream.Stream;

public class TaskFour {
    public static Stream<Long> linearGenerator(long a, long c, long m) {
        return Stream.iterate(System.currentTimeMillis(), x -> (a * x + c) % m);
    }
}
