package entities;

import utilities.PersonInterface;

import java.util.Objects;

public class Driver implements PersonInterface {
    public static void beHappy(Person waiter) {
        System.out.println("Всем автолюбителям это понравилось");
        getSignal(waiter);
    }

    public static void getSignal(Person waiter) {
        System.out.println("Автолюбители дают сигнал");
        if (Objects.equals(waiter.name, "Официант")) {
            waiter.jumpOut();
            waiter.serveLunch();
        }
    }

    @Override
    public String getName() {
        return "Водила";
    }

    @Override
    public void walkBy(Infrastructure infrastructure) {
        System.out.println("Водитель прогулялся в месте '" + infrastructure.getName() + "'");
    }

    @Override
    public void jumpOut() {
        System.out.println("Бешеный водитель выскочил из машины");
    }
}
