package entities;

import utilities.Person;

public class MainCharacter extends Person {
    public final String name;

    public MainCharacter() {
        name = "неопознанный персонаж";
        joinStory();
    }

    public MainCharacter(String name) {
        this.name = name;
        joinStory();
    }

    public void stopNearTheBuilding() {
        System.out.println(name + " остановился около небольшого здания, над входом в которое было написано: \"Пищезаправочная станция\"");
    }

    public void serveLunch() {
        System.out.println(name + " подает обед прямо в машину");
    }

    private void joinStory() {
        System.out.println("Персонаж '" + name + "' присоединилась к истории.");
    }

    @Override
    public void walkBy(Infrastructure infrastructure) {
        System.out.println(name + " прогулялся в месте: '" + infrastructure.getName() + "'");
        infrastructure.addWalker(this);
    }

    @Override
    public void jumpOut() {
        System.out.println(name + " выскакивает из ресторана");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Персонаж, которого зовут '" + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof MainCharacter) {
            return name.equals(((MainCharacter) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
