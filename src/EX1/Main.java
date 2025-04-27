package EX1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant("Beach House", 5);
        Restaurant r2 = new Restaurant("Pasties & Tea", 7.5);
        Restaurant r3 = new Restaurant("The View", 8.9);
        Restaurant r4 = new Restaurant("Beach House", 5);
        Restaurant r5 = new Restaurant("Pasties & Tea", 9);


        //meter en el hashset
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
