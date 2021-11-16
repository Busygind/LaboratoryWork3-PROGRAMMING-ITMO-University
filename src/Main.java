import entities.*;

public class Main {
    public static void main(String[] args) {
        Street lp = new Street("Лос-Паганоса");
        lp.drag();

        Building shop = new Building("магазины");
        Building restaurant = new Building("рестораны");
        Building diningRoom = new Building("столовые");
        Building hotel = new Building("гостиницы");
        Building cinema = new Building("кинотеатры");
        Building booth = new Building("весёлые балаганчики");
        Building garage = new Building("подземные гаражи");
        Building gasStation = new Building("бензозаправочные станции");
        Building[] buildings = new Building[]{shop, restaurant, diningRoom, hotel, cinema, booth, garage, gasStation};
        for (Building building : buildings) {
            building.beInHouses();
        }

        Infrastructure beach = new Infrastructure("Пляжи");
        Infrastructure pool = new Infrastructure("купальни");
        Infrastructure towers = new Infrastructure("ныряльные вышки");
        Infrastructure ports = new Infrastructure("лодочные и пароходные пристани");
        Infrastructure rests = new Infrastructure("плавучие рестораны");
        Infrastructure swing = new Infrastructure("морские качели и карусели");
        Infrastructure wheels = new Infrastructure("чертовы водяные колеса");
        Infrastructure paraboloid = new Infrastructure("параболоиды");
        Infrastructure[] infrastructure = new Infrastructure[]{beach, pool, towers, ports, rests, swing, wheels, paraboloid};
        for (Infrastructure inf : infrastructure) {
            inf.hasWalkingShorties();
        }

        Person ponchik = new Person("Пончик");
        ponchik.walkingOnShore();
        ponchik.lookAtTheShorties();

        CommonRestaurant cr = new CommonRestaurant();
        FoodStation fs = new FoodStation();

        Person waiter = new Person("Официант");
        cr.hasTerrace();
        fs.hasTerrace();
        fs.hasOutsideService(waiter);


    }
}
