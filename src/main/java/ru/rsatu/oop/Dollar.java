package ru.rsatu.oop;

public class Dollar extends Money{
    public Dollar(float value) {
        super("Dollar", value, 60.32f);
    }

    @Override
    public void printInfo() {
        System.out.println("DollarInfo: "+this+ "currency "+getCurrency());
    }
}
