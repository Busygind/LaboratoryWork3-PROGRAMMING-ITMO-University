package utilities;

import entities.Person;

public abstract class RestaurantAbstract implements BuildingInterface {
    protected boolean isCommon;

    public abstract boolean hasTerrace();

    public abstract boolean hasOutsideService();

    public boolean restaurantIsCommon() {
        return isCommon;
    }

    public abstract void getOutsideServiceAvialability(Person waiter);

    public void setCommon(boolean common) {
        this.isCommon = common;
    }
}
