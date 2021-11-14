package entities;

import utilities.Place;
import utilities.RestaurantAbstract;

public class CommonRestaurant extends RestaurantAbstract {
    private final String name;
    private final Place PLACE = Place.FIRST_SIDE_OF_ROAD;

    public CommonRestaurant(){
        name = "Обычные рестораны";
        setCommon(true);
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " присоединились к истории.");
    }

    @Override
    public void hasTerrace(){
        System.out.println(name + " имели открытую веранду со столами, за которыми обедали посетители");
    }

    @Override
    public void hasOutsideService() {
        if (!isCommon()){
            System.out.println("В заведении \"" + name + "\" можно было пообедать или позавтракать, не выходя из автомашины");
        }
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
        return "Обычный ресторан '" + name + "' находится на " + PLACE;
    }

    @Override
    public boolean equals(Object obj){
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
