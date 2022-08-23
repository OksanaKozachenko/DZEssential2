package Task2;

public class Car {
    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Car() {
    }
    public Car(int year) {
        this.year = year;
    }
    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    private int year;
    private String color;

}
