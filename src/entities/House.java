package entities;

import utilities.BuildingInterface;
import utilities.StreetSideType;

import java.util.ArrayList;
import java.util.Arrays;

public class House implements BuildingInterface {
    private StreetSideType streetSide;
    public ArrayList<Institution> institutions = new ArrayList<>();

    public House() {
        this.setStreetSide();
        joinStory();
    }

    public void fillHouse(Institution[] institutions) {
        for (Institution institution : institutions) {
            this.institutions.add(institution);
            institution.inHouse = true;
        }
        System.out.println("Дома заполнились заведениями");
    }

    public void showHouseContent() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < this.institutions.toArray().length; i++) {
            names.add(this.institutions.get(i).name);
        }
        System.out.println(Arrays.toString(new ArrayList[]{names}));
    }

    private void joinStory() {
        System.out.println("Дома присоединились к истории.");
    }

    @Override
    public StreetSideType getStreetSide() {
        return this.streetSide;
    }

    @Override
    public void setStreetSide() {
        this.streetSide = StreetSideType.LEFT_SIDE;
    }

    @Override
    public String getName() {
        return null;
    }
}
