package org.example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public List<String> sortString(List<String> strings) {
        List<String> result = strings.stream().map(String::toUpperCase).sorted()
                .collect(Collectors.toList());
        Collections.reverse(result);
        return result;
    }

}
