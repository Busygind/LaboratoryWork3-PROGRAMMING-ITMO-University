import entities.*;

public class Main {
    public static void main(String[] args) {
        Street lp = new Street("Лос-Паганоса");
        Building shop = new Building("магазины");
        Building restaurant = new Building("рестораны");
        Building diningRoom = new Building("столовые");
        Building hotel = new Building("гостиницы");
        Building cinema = new Building("кинотеатры");
        Building booth = new Building("весёлые балаганчики");
        Building garage = new Building("подземные гаражи");
        Building gasStation = new Building("бензозаправочные станции");
        Infrastructure beach = new Infrastructure("Пляжи");
        Infrastructure pool = new Infrastructure("купальни");
        Infrastructure towers = new Infrastructure("ныряльные вышки");
        Infrastructure ports = new Infrastructure("лодочные и пароходные пристани");
        Infrastructure rests = new Infrastructure("плавучие рестораны");
        Infrastructure swing = new Infrastructure("морские качели и карусели");
        Infrastructure wheels = new Infrastructure("чертовы водяные колеса");
        Infrastructure paraboloid = new Infrastructure("параболоиды");
        Infrastructure other = new Infrastructure("другие увеселительные механизмы");
        Person ponchik = new Person("Пончик");
        CommonRestaurant cr = new CommonRestaurant();
        FoodStation fs = new FoodStation();
        Person waiter = new Person("Официант");


        beach.addInfInArray();
        pool.addInfInArray();
        towers.addInfInArray();
        ports.addInfInArray();
        rests.addInfInArray();
        swing.addInfInArray();
        wheels.addInfInArray();
        paraboloid.addInfInArray();
        other.addInfInArray();


        lp.drag();
        shop.beInHouses();
        restaurant.beInHouses();
        diningRoom.beInHouses();
        hotel.beInHouses();
        cinema.beInHouses();
        booth.beInHouses();
        garage.beInHouses();
        gasStation.beInHouses();
        other.hasWalkingShorties();
        ponchik.walkingOnShore();
        ponchik.lookAtTheShorties();
        ponchik.stopNearTheBuilding();
        cr.hasTerrace();
        fs.hasTerrace();
        fs.hasOutsideService();
        waiter.jumpOut();
        waiter.serveLunch();
    }
}
