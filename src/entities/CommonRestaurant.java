package entities;

import utilities.StreetSideType;
import utilities.RestaurantAbstract;

public class CommonRestaurant extends RestaurantAbstract {
    private final String name;
    private StreetSideType streetSide;

    public CommonRestaurant() {
        name = "Обычные рестораны";
        setCommon(true);
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " присоединились к истории.");
    }

    public void getTerraceAvailability() {
        if (this.hasTerrace()) {
            System.out.println("У ресторана '" + name + "' есть терраса");
        } else {
            System.out.println("У ресторана '" + name + "' нет террасы");

        }
    }

    @Override
    public boolean hasTerrace() {
        return this instanceof RestaurantAbstract;
    }

    @Override
    public void getOutsideServiceAvialability(MainCharacter waiter) {
        if (this.hasOutsideService()) {
            System.out.println("В заведении \"" + name + "\" можно было пообедать или позавтракать, не выходя из автомашины.");
            Driver.beHappy(waiter);
        } else {
            System.out.println("В заведении \"" + name + "\" нет обслуживания автомашин");
        }
    }

    @Override
    public boolean hasOutsideService() {
        return !restaurantIsCommon();
    }

    @Override
    public void setStreetSide() {
        streetSide = StreetSideType.LEFT_SIDE;
    }

    @Override
    public StreetSideType getStreetSide() {
        setStreetSide();
        return streetSide;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Обычный ресторан '" + name + "' находится на " + getStreetSide();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof CommonRestaurant) {
            return name.equals(((CommonRestaurant) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
