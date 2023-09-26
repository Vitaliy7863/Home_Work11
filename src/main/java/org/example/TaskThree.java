package org.example;

import java.util.Arrays;

public class TaskThree {
    public String sortArrNumber(String[] numbArr) {
        StringBuilder result = new StringBuilder();
        Arrays.stream(numbArr).map(i -> i.split(", "))
                .flatMap(Arrays::stream).sorted().forEach(i -> {
                    if (result.length() > 0) {
                        result.append(", ").append(i);
                    } else {
                        result.append(i);
                    }
                });

        return String.valueOf(result);
    }
}
