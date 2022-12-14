package Task3;

public class Car {
    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){
    }
    public Car(int year) {
        this.year = year;
    }
    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }
    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight=weight;
    }
    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight=weight;
        this.color = color;
    }
}
