package entities;

import utilities.ObjectInterface;

public class Street implements ObjectInterface {
    private final String name;
    private boolean beTheBiggest;
    private boolean dragOnShore;

    public Street(String name) {
        this.name = name;
        joinStory();
    }

    public Street(String name, boolean beTheBiggest) {
        this.name = name;
        this.beTheBiggest = true;
        joinStory();
    }

    public void drag() {
        this.dragOnShore = true;
        System.out.println("Улица " + name + " тянется вдоль береговой линии");
    }

    private void joinStory() {
        if (this.beTheBiggest) {
            System.out.println("Самая большая и красивая улица '" + name + "' присоединилась к истории.");
        } else {
            System.out.println("Обычная улица '" + name + "' присоединилась к истории.");

        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Улица '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Street) {
            return name.equals(((Street) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
