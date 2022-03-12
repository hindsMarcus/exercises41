package Task1;

public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("Marcus", 24);

        Car car1 = new Car("Chevrolet", "Corvette C3", 1971, "2-door convertible");

        car1.setDriver(driver1);
        System.out.println(car1 + "" + driver1);

        Driver driver2 = new Driver("Lando Norris", 22);

        Car car2 = new Car("McLaren", "P1", 2013, "2-door coupé");

        car1.setDriver(driver2);
        System.out.println(car2 + "" + driver2);
    }
}
