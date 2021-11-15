package utilities;

public abstract class RestaurantAbstract implements BuildingInterface {
    protected boolean common;

    public abstract void hasTerrace();

    public abstract void hasOutsideService();

    public boolean isCommon() {
        return common;
    }

    public void setCommon(boolean common) {
        this.common = common;
    }
}
