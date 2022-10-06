package ru.rsatu;

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
        System.out.println(m2+" is bigger "+m1+": "+Money.compare(m1,m2));

        Dump.dumpEverything(m1.getClass().getName());
        Dump.dumpEverything(m1.getClass().getSuperclass().getName());
    }
}