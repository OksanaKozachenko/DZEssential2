package Task2;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();
      car.setYear(5);
        System.out.println(car.getYear());
        Car car1= new Car(4 );
        System.out.println(car1.getYear());
        Car car2= new Car(3, "red");
        System.out.println(car2.getYear()+" "+car2.getColor());

    }
}
