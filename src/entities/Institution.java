package entities;

import utilities.ObjectInterface;

import java.util.Objects;

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
        return "Institution '" + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Institution institution = (Institution) obj;

        return getName().equals(institution.getName()) && inHouse == institution.inHouse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inHouse);
    }
}
