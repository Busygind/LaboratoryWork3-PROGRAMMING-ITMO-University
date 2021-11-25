package utilities;

import java.util.ArrayList;

public interface WalkablePlace extends ObjectInterface{
    boolean hasWalkers = false;
    ArrayList<Person> currentWalkers = new ArrayList<>();
    StreetSideType getStreetSide();

    void setStreetSide(StreetSideType streetSide);
}
