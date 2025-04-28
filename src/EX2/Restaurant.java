package EX2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

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
        if (this == o) return true;
        if ((this == null || this.getClass() != o.getClass())) return false;
        Restaurant otherRestaurant = (Restaurant) o;
        return score == otherRestaurant.getScore() && Objects.equals(name, otherRestaurant.name);
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


    @Override
    public int compareTo(Restaurant o) {
        int nameComparation = this.name.compareTo(o.name);
        if (nameComparation != 0) {
            return nameComparation;
        } else {
            return Double.compare(o.score, this.score);
        }

    }


}
