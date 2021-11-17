package entities;

import utilities.ObjectInterface;

public class Institution implements ObjectInterface {
    public final String name;
    public boolean inHouse;

    public Institution() {
        name = "неопознанное заведение";
        joinStory();
    }

    public Institution(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println(name + " присоединились к истории.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Здание '" + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Institution) {
            return name.equals(((Institution) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
