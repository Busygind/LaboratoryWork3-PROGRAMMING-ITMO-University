package entities;

import utilities.ObjectInterface;
import utilities.Place;

public class Building implements ObjectInterface {
    private final String name;
    private final Place PLACE = Place.FIRST_SIDE_OF_ROAD;
    private static int countOfBuildings;

    public Building(){
        name = "неопознанное здание";
        joinStory();
    }

    public Building(String name){
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " присоединились к истории.");
    }

    public void beInHouses(){
        if (PLACE == Place.FIRST_SIDE_OF_ROAD && countOfBuildings == 0) {
            System.out.print("В домах, которые стояли здесь лишь по одну сторону улицы, помещались " + name + ", ");
            countOfBuildings += 1;
        } else {
            System.out.println(name + ", ");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Place getPlace() {
        return PLACE;
    }

    @Override
    public String toString() {
        return "Здание '" + name + "' находится на " + PLACE;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Building) {
            return name.equals(((Building) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
