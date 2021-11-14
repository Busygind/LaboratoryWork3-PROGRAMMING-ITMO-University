package objects;

import utilities.PersonInterface;

public class Person implements PersonInterface {
    private final String name;

    public Person(){
        name = "неопознанный персонаж";
        joinStory();
    }

    public Person(String name) {
        this.name = name;
        joinStory();
    }

    public void walkingOnShore() {
        System.out.println(name + " прогулялся по набережной");
    }

    public void lookAtTheShorties() {
        System.out.println(name + " поглазел на купающихся коротышек");
    }

    public void stopNearTheBuilding() {
        System.out.println(name + " остановился около небольшого здания, над входом в которое было написано: \"Пищезаправочная станция\"");
    }

    public void jumpOut() {
        System.out.println(name + " выскакивает из ресторана");
    }

    public void serveLunch() {
        System.out.println(name + " подает обед прямо в машину");
    }

    private void joinStory() {
        System.out.println("Персонаж '" + name + "' присоединилась к истории.");
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
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj instanceof Person) {
            return name.equals(((Person) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
