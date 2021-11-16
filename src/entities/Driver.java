package entities;

import utilities.PersonInterface;

public class Driver implements PersonInterface {
    public static void beHappy(Person waiter) {
        System.out.println("Всем автолюбителям это понравилось");
        getSignal(waiter);
    }

    public static void getSignal(Person waiter) {
        System.out.println("Автолюбители дают сигнал");
        if (waiter.name == "Официант") {
            waiter.jumpOut();
            waiter.serveLunch();
        }
    }

    @Override
    public String getName() {
        return "Водила";
    }

    @Override
    public void walkingOnShore() {}

    @Override
    public void jumpOut() {}
}
