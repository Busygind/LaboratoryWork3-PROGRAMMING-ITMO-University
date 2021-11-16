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
        System.out.println("Персонаж '" + name + "' присоединилась к истории.");
    }

    @Override
    public void hasOutsideService(Person waiter) {
        if (restaurantIsCommon()) {
            System.out.println("В заведении \"" + name + "\" нет обслуживания автомашин");
        } else {
            System.out.println("В заведении \"" + name + "\" можно было пообедать или позавтракать, не выходя из автомашины.");
            Driver.beHappy(waiter);
        }
    }

    @Override
    public void hasTerrace() {
        System.out.println(name + " тоже имела открытую веранду со столами, за которыми обедали посетители.");
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
