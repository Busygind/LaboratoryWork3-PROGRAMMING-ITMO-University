package entities;

import utilities.BuildingInterface;
import utilities.StreetSideType;

public class Building implements BuildingInterface {
    private final String name;
    private static int countOfBuildings;
    private StreetSideType streetSide;

    public Building() {
        name = "неопознанное здание";
        joinStory();
    }

    public Building(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " присоединились к истории.");
    }

    public void beInHouses() {
        if (getStreetSide() == StreetSideType.LEFT_SIDE && countOfBuildings == 0) {
            System.out.print("В домах, которые стояли здесь лишь по одну сторону улицы, помещались " + name + ", ");
            countOfBuildings += 1;
        } else if (getStreetSide() == StreetSideType.LEFT_SIDE) {
            System.out.println(name + ", ");
        }
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
        return "Здание '" + name + "' находится на " + getStreetSide();
    }

    @Override
    public boolean equals(Object obj) {
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
