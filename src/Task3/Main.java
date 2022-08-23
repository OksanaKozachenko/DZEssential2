package Task3;

import Task2.Car;

import static java.awt.Color.black;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(5);
        System.out.println(car.getYear());
        Car car1 = new Car(4);
        System.out.println(car1.getYear());
        Task3.Car car2 = new Task3.Car(4, 250);
        System.out.println(car2.getYear()+" "+car2.getSpeed());
        Task3.Car car3 = new Task3.Car(4, 250, 1000);
        System.out.println(car3.getYear()+" "+car3.getSpeed()+" "+car3.getWeight());






    }
}

