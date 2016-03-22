package com.michalkordas.intellij.show.newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Debugging {
    private static final String[] FAMILY = {"TDD", "BDD", "DDD", "waterfall", "comments", "UML"};

    List<String> myFamily() {
        final List<String> list = Arrays.asList(FAMILY);
        final ArrayList<String> result = new ArrayList<>();
        for (String item : list) {
            if (item.length() == 3) {
                result.add(item);
            }
        }
        return Collections.unmodifiableList(result);
    }

    int answerToEverything() {
        return 42;
    }
}
