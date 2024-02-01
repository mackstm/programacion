package es.ies.puerto.app;


import es.ies.puerto.vehicles.Car;
import es.ies.puerto.vehicles.Concessionaire;
import es.ies.puerto.vehicles.Motorcycle;

/**
 * App that tests functionalities of vehicle interface and all derivatives
 * @author Jose Maximiliano Boada Martin
 */

public class AppConcessionaire {
    public static void main(String[] args) {
        Concessionaire concessionaire = new Concessionaire();
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson","Sportster","MNO345",50);
        Motorcycle motorcycle2 = new Motorcycle("Yamaha","YZF R6","PQR678",90);
        Motorcycle motorcycle3 = new Motorcycle("Ducati","Monster","STU901",70);
        Motorcycle motorcycle4 = new Motorcycle("Suzuki","GSX-R750","VWX234",80);
        Motorcycle motorcycle5 = new Motorcycle("Kawasaki","Ninja","ZAB567",85);

        Car car1 = new Car("Toyota","Corolla","ABC123",60);
        Car car2 = new Car("Honda","Civic","XYZ789",75);
        Car car3 = new Car("Ford","Mustang","DEF456",100);
        Car car4 = new Car("Chevrolet","Impala","GHI789",80);
        Car car5 = new Car("Volkswagen","Golf","JKL012",65);



        //Testing add methods
        concessionaire.addMotorcycle(motorcycle1);
        concessionaire.addMotorcycle(motorcycle2);
        concessionaire.addMotorcycle(motorcycle3);
        concessionaire.addMotorcycle(motorcycle4);
        concessionaire.addMotorcycle(motorcycle5);
        concessionaire.addMotorcycle(motorcycle1);

        concessionaire.addCar(car1);
        concessionaire.addCar(car2);
        concessionaire.addCar(car3);
        concessionaire.addCar(car4);
        concessionaire.addCar(car5);

    }
}
