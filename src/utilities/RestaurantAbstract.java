package utilities;

import entities.Person;

public abstract class RestaurantAbstract implements BuildingInterface {
    protected boolean isCommon;

    public abstract void hasTerrace();

    public abstract void hasOutsideService(Person waiter);

    public boolean restaurantIsCommon() {
        return isCommon;
    }

    public void setCommon(boolean common) {
        this.isCommon = common;
    }
}
