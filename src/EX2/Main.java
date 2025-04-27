package EX2;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Restaurant> restaurants = new TreeSet<>();

        Restaurant r1 = new Restaurant("Beach House", 5);
        Restaurant r2 = new Restaurant("Pasties & Tea", 7.5);
        Restaurant r3 = new Restaurant("The View", 8.9);
        Restaurant r4 = new Restaurant("Beach House", 5);
        Restaurant r5 = new Restaurant("Pasties & Tea", 9);

        restaurants.add(r1);
        restaurants.add(r2);
        restaurants.add(r3);
        restaurants.add(r4);
        restaurants.add(r5);

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }



    }
}
