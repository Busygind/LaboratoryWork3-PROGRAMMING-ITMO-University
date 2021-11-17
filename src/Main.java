import entities.*;

public class Main {
    public static void main(String[] args) {
        Street lp = new Street("Лос-Паганоса", true);
        lp.drag();

        Institution shop = new Institution("магазины");
        Institution restaurant = new Institution("рестораны");
        Institution diningRoom = new Institution("столовые");
        Institution hotel = new Institution("гостиницы");
        Institution cinema = new Institution("кинотеатры");
        Institution booth = new Institution("весёлые балаганчики");
        Institution garage = new Institution("подземные гаражи");
        Institution gasStation = new Institution("бензозаправочные станции");
        Institution[] institutions = new Institution[]{shop, restaurant, diningRoom, hotel, cinema, booth, garage, gasStation};
        House house = new House();
        house.fillHouse(institutions);
        house.showHouseContent();

        Infrastructure beach = new Infrastructure("Пляжи");
        Infrastructure pool = new Infrastructure("купальни");
        Infrastructure towers = new Infrastructure("ныряльные вышки");
        Infrastructure ports = new Infrastructure("лодочные и пароходные пристани");
        Infrastructure rests = new Infrastructure("плавучие рестораны");
        Infrastructure swing = new Infrastructure("морские качели и карусели");
        Infrastructure wheels = new Infrastructure("чертовы водяные колеса");
        Infrastructure paraboloid = new Infrastructure("параболоиды");
        Walker shorty = new Walker("Коротышка");
        Infrastructure[] infrastructure = new Infrastructure[]{beach, pool, towers, ports, rests, swing, wheels, paraboloid};
        for (Infrastructure inf : infrastructure) {
            shorty.walkBy(inf);
        }

        MainCharacter ponchik = new MainCharacter("Пончик");
        Infrastructure shore = new Infrastructure("побережье");
        ponchik.walkBy(shore);

        CommonRestaurant cr = new CommonRestaurant();
        FoodStation fs = new FoodStation();

        MainCharacter waiter = new MainCharacter("Официант");
        cr.getTerraceAvailability();
        fs.getTerraceAvailability();
        fs.getOutsideServiceAvialability(waiter);

    }
}
