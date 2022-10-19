package ru.rsatu.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Collections {

    private static Map<Integer, String> intMap = new HashMap<>();
    private static Set<Integer> pow2Set = new HashSet<>();
    private static List<Integer> numbersList = new ArrayList<>();

    private static String intToStr(Integer number) {
        if (intMap.containsKey(number)) {
            return intMap.get(number);
        } else {
            return "Not in map";
        }
    }

    private static boolean isPow2(Integer number) {
        return pow2Set.contains(number);
    }

    public static void demo() {
        intMap.put(1,"1");
        intMap.put(2, "2");
        intMap.put(3,"3");
        System.out.println(intToStr(1));
        System.out.println(intToStr(10));
        intMap.remove(1);
        System.out.println(intToStr(1));
        intMap.forEach((number, s) -> System.out.println("key number: " + number + " value string: " + s ));

        for (int i = 1; i <= 1024; i = i*2) {
            pow2Set.add(i);
        }
        pow2Set.forEach((number -> System.out.print(number + " ")));
        System.out.println();
        System.out.println("1024 is pow 2: "+isPow2(1024));
        System.out.println("11 is pow 2: "+isPow2(11));

        Random rnd = new Random();
        for (int i = 0; i <= 10; i++) {
            numbersList.add(rnd.nextInt());
            System.out.print(numbersList.get(i) + " ");
        }
        System.out.println();
        java.util.Collections.sort(numbersList);
        numbersList.forEach((n) -> System.out.print(n + " "));
        System.out.println();


    }
}
