package entities;

import utilities.PersonInterface;

import java.util.ArrayList;

public class Walker implements PersonInterface {
    private String name;
    private boolean walkingRightNow;
    private ArrayList<Infrastructure> places = new ArrayList<>();

    public Walker() {
        this.name = "Неопознанный гуляющий персонаж";
        startWalking();
        joinStory();
    }

    public Walker(String name) {
        this.name = name;
        startWalking();
        joinStory();
    }

    private void joinStory() {
        System.out.println("Гуляющий персонаж '" + name + "' присоединилось к истории.");
    }

    public void startWalking() {
        this.walkingRightNow = true;
    }

    public boolean isWalkingRightNow() {
        return walkingRightNow;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void walkBy(Infrastructure infrastructure) {
        startWalking();
        places.add(infrastructure);
        infrastructure.addWalker(this);
    }

    @Override
    public void jumpOut() {
        System.out.println("Гуляющий человек выскакивает из ресторана");
    }
}
