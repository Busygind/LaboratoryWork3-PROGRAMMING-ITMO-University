package entities;

import utilities.BuildingInterface;
import utilities.StreetSideType;

public class Building implements BuildingInterface {
    private final String name;
    private static int countOfBuildings;
    private StreetSideType streetSide;
    private static String[] houses = new String[9];
    private static int countOfHouses = 0;

    public Building() {
        name = "неопознанное здание";
        joinStory();
    }

    public Building(String name) {
        this.name = name;
        joinStory();
    }

    public void beInHouses() {
        if (countOfHouses <= 6) {
            System.out.println(name + ", ");
            countOfHouses += 1;
        } else {
            System.out.println(name + " были в домах на левой стороне дороги");
        }
    }

    private void joinStory() {
        System.out.println(name + " присоединились к истории.");
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
