package ru.rsatu.reflect;

import java.lang.reflect.*;


public class Dump {
    public static void dumpEverything(String className) {
        try {
            Class<?> c = Class.forName(className);
            System.out.println("----------------------------"+className+"----------------------------");
            Method[] m = c.getMethods();
            System.out.println("----------------------------Methods----------------------------");
            for (Method method : m)
                System.out.println(method.toString());
            Field[] f = c.getDeclaredFields();
            System.out.println("----------------------------Fields----------------------------");
            for (Field field : f)
                System.out.println(field.toString());

        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }

    public static Method getSomeMethod(Class<?> cls, String methodName, Class... parameterTypes) {
        try {
            return cls.getMethod(methodName, parameterTypes);
        } catch (SecurityException | NoSuchMethodException e) {
            return null;
        }
    }

    public static void printAllParents(Class<?> cls) {
        System.out.println("PrintAllParents:");
        while (cls != null) {
            System.out.println(cls.getName());
            cls = cls.getSuperclass();
        }
    }
}