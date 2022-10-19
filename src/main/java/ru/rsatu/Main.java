package ru.rsatu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import ru.rsatu.collections.Collections;
import ru.rsatu.generics.Pair;
import ru.rsatu.generics.Reverse;
import ru.rsatu.oop.Dollar;
import ru.rsatu.oop.Euro;
import ru.rsatu.oop.Money;
import ru.rsatu.reflect.Dump;

public class Main {
    public static void main(String[] args) {
        Money m1 = new Euro(100);
        Money m2 = new Dollar(100);
        m1.printInfo();
        m2.printInfo();
        System.out.println(m2 + " is bigger " + m1 + ": " + Money.compare(m1, m2));

        Dump.dumpEverything(m1.getClass().getName());
        Dump.dumpEverything(m1.getClass().getSuperclass().getName());

        Method meth = Dump.getSomeMethod(m1.getClass(), "getValue");
        try {
            System.out.println("\n\nReflection call getValue: " + meth.invoke(m1));
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

        meth = Dump.getSomeMethod(Money.class, "compare", Money.class, Money.class);
        try {
            System.out.println("Reflection static call compare: " + meth.invoke(null,m2,m1)+'\n');
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

        Dump.printAllParents(m1.getClass());
        Dump.printAllParents(m2.getClass());

        System.out.println();

        Collections.demo();

        System.out.println();

        List<Pair<String, Money>> money = Arrays.asList(
                new Pair<>(m1.toString(), m1),
                new Pair<>(m2.toString(), m2)
        );

        for (Pair<String, Money> m : money) {
            System.out.println(m.getFirst() + ": " + m.getSecond().getValue());
        }

        List<Pair<String, Money>> reversed = Reverse.reverseGeneric(money);
        System.out.println("Reversed list:");

        reversed.forEach((m) -> System.out.println(m.getFirst() + ": " + m.getSecond().getValue()));

    }
}