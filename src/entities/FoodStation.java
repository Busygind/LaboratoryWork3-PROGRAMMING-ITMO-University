package entities;

import utilities.StreetSideType;
import utilities.RestaurantAbstract;

public class FoodStation extends RestaurantAbstract {
    private final String name;
    private StreetSideType streetSide;


    public FoodStation() {
        name = "Пищезаправочная станция";
        setCommon(false);
        joinStory();
    }

    private void joinStory() {
        System.out.println("Необычный ресторан '" + name + "' присоединилась к истории.");
    }

    public void getOutsideServiceAvialability(Person waiter) {
        if (this.hasOutsideService()) {
            System.out.println("В заведении \"" + name + "\" можно было пообедать или позавтракать, не выходя из автомашины.");
            Driver.beHappy(waiter);
        } else {
            System.out.println("В заведении \"" + name + "\" нет обслуживания автомашин");
        }
    }

    public void getTerraceAvailability() {
        if (this.hasTerrace()) {
            System.out.println("У ресторана '" + name + "' есть терраса");
        } else {
            System.out.println("У ресторана '" + name + "' нет террасы");

        }
    }

    @Override
    public boolean hasOutsideService() {
        return !restaurantIsCommon();
    }

    @Override
    public boolean hasTerrace() {
        return this instanceof RestaurantAbstract;
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
        return "Пищезаправочная станция '" + name + "' находится на " + getStreetSide();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof FoodStation) {
            return name.equals(((FoodStation) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
