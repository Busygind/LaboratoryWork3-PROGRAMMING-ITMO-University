package entities;

import utilities.ObjectInterface;

public class Street implements ObjectInterface {
    private final String name;

    public Street(String name) {
        this.name = name;
        joinStory();
    }

    public void drag() {
        System.out.println("Улица " + name + " тянулась вдоль береговой линии");
    }

    private void joinStory() {
        System.out.println("Улица '" + name + "' присоединилась к истории.");
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
