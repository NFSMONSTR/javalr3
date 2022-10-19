package ru.rsatu.generics;

import java.util.Collections;
import java.util.List;

public class Reverse {
    public static <T> List<T> reverseGeneric(List<T> list) {
        List<T> copyList = list.subList(0, list.size());
        Collections.reverse(copyList);
        return copyList;
    }
}
