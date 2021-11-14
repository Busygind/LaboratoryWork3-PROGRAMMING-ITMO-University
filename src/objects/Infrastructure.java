package objects;

import utilities.ObjectInterface;
import utilities.Place;

public class Infrastructure implements ObjectInterface {
    private final String name;
    private final Place PLACE = Place.SECOND_SIDE_OF_ROAD;
    private static String[] inf = new String[10];
    private static int countOfInfs = 0;

    public Infrastructure(String name){
        this.name = name;
        joinStory();
    }

    public void addInfInArray(){
        inf[countOfInfs] = this.name;
        countOfInfs += 1;
    }

    public void hasWalkingShorties(){
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < 9; i++){
            list.append(inf[i]).append(", ");
            if (i == 4){
                list.append("\n");
            }
        }
        System.out.println(list + "были переполнены гуляющими коротышками");
    }

    private void joinStory() {
        System.out.println("Заведение '" + name + "' присоединилось к истории.");
    }

    @Override
    public Place getPlace() {
        return PLACE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Развлечение '" + name + "' находится на " + PLACE;
    }

    @Override
    public boolean equals(Object obj){
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
