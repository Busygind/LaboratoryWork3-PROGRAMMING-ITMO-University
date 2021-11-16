package entities;

import utilities.BuildingInterface;
import utilities.StreetSideType;

public class Infrastructure implements BuildingInterface {
    private final String name;
    private StreetSideType streetSide;
    private static int countOfInfs = 0;

    public Infrastructure(String name) {
        this.name = name;
        joinStory();
    }

    public void hasWalkingShorties() {
        if (countOfInfs <= 6) {
            System.out.println(name + ",");
            countOfInfs += 1;
        } else {
            System.out.println(name + " были переполнены гуляющими коротышками");
        }
    }

    private void joinStory() {
        System.out.println("Заведение '" + name + "' присоединилось к истории.");
    }

    @Override
    public void setStreetSide() {
        streetSide = StreetSideType.RIGHT_SIDE;
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
        return "Развлечение '" + name + "' находится на " + getStreetSide();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Infrastructure) {
            return name.equals(((Infrastructure) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
