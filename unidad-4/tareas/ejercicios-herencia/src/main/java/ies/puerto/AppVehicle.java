package ies.puerto;

/**
 * Tests vehicle class behavior
 * @author Jose Maximiliano Boada Martin
 */
public class AppVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Citroen", "Berlingo", 10.50f);
        Person driver = new Person("Manuel", 20, "22222222C");
        Car car = new Car("Toyota", "Yaris", 10.40f, driver, 45);
        Motorcycle motorcycle = new Motorcycle("Toyota", "Cross", 2000, driver);
        System.out.println(vehicle);
        System.out.println(car);
        System.out.println(motorcycle);
    }
}
