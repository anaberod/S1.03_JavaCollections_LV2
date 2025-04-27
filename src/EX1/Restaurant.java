package EX1;

import java.util.Objects;

public class Restaurant {

    private String name;
    private double score;

    public Restaurant(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if ((this == null || this.getClass() != o.getClass())) return false;
        Restaurant otherRestaurant = (Restaurant) o;
        return score == otherRestaurant.getScore() && Objects.equals(name,otherRestaurant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurant: " +
                "name= '" + name + '\'' +
                ", score= " + score;
    }
}