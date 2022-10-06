package ru.rsatu.oop;

public abstract class Money implements MoneyInterface {
    protected float value;
    protected float currency;
    protected String name;
    public Money(String name, float value, float currency) {
        this.value = value;
        this.currency = currency;
        this.name = name;
    }

    public static int compare(Money obj1, Money obj2) {
        return Float.compare(obj1.getCurrency()*obj1.getValue(),obj2.getCurrency()*obj2.getValue());
    }

    @Override
    public float getValue() {
        return value;
    }

    @Override
    public float getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Parent "+name+": "+getValue();
    }
    public abstract void printInfo();
}
