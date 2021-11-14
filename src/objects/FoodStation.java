package objects;

import utilities.Place;
import utilities.RestaurantAbstract;

public class FoodStation extends RestaurantAbstract {
    private final String name;
    private final Place PLACE = Place.FIRST_SIDE_OF_ROAD;

    public FoodStation(){
        name = "Пищезаправочная станция";
        setCommon(false);
        joinStory();
    }

    private void joinStory() {
        System.out.println("Персонаж '" + name + "' присоединилась к истории.");
    }

    @Override
    public void hasOutsideService(){
        if (!isCommon()){
            System.out.println("В заведении \"" + name + "\" можно было пообедать или позавтракать, не выходя из автомашины. \nЭто было очень удобно для любителей автомобильного спорта.");
        }
    }

    @Override
    public void hasTerrace() {
        System.out.println(name + " тоже имела открытую веранду со столами, за которыми обедали посетители.");
    }

    @Override
    public Place getPlace() {
        return PLACE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Пищезаправочная станция '" + name + "' находится на " + PLACE;
    }

    @Override
    public boolean equals(Object obj){
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
