package utilities;

import entities.MainCharacter;

public abstract class RestaurantAbstract implements BuildingInterface {
    protected boolean isCommon;

    public abstract boolean hasTerrace();

    public abstract boolean hasOutsideService();

    public boolean restaurantIsCommon() {
        return isCommon;
    }

    public abstract void getOutsideServiceAvialability(MainCharacter waiter);

    public void setCommon(boolean common) {
        this.isCommon = common;
    }
}
