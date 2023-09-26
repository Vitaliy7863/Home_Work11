package org.example;

import java.util.List;
import java.util.stream.IntStream;

public class TaskOne {
    public String oddNames(List<String> names) {
        StringBuilder resultOddNames = new StringBuilder();

        IntStream.range(0, names.size()).filter(i -> i % 2 != 1)
                .forEachOrdered(i -> {
                    if (resultOddNames.length() > 0) {
                        resultOddNames.append(", ");
                    }
                    resultOddNames.append((i + 1)).append(". ").append(names.get(i));
                });
        return resultOddNames.toString();
    }
}
