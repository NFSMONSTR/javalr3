package ru.rsatu.oop;

public class Euro extends Money{


    public Euro(float value) {
        super(Euro.class.getName(), value, 59.8f);
    }

    @Override
    public String toString() {
        return "Euro: "+getValue();
    }

    @Override
    public void printInfo() {
        System.out.println(this+ " currency: "+getCurrency());
    }
}
