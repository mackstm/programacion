package es.ies.puerto.app;


import es.ies.puerto.abstracts.Vehicle;
import es.ies.puerto.vehicles.*;

import java.util.Scanner;

/**
 * App that tests functionalities of vehicle interface and all derivatives
 * @author Jose Maximiliano Boada Martin
 */

public class AppConcessionaire {
    public static void main(String[] args) {
        /**
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
         */
        Scanner read = new Scanner(System.in);
        int vehicleOption;
        int operationOption;
        Concessionaire concessionaire = new Concessionaire();
        do {
            System.out.println("____________**************____________");
            System.out.println("------------Concessionaire------------");
            System.out.println("************______________************");
            System.out.println("1. Motorcycles");
            System.out.println("2. Cars");
            System.out.println("3. Trucks");
            System.out.println("4. Bicycles");
            System.out.println("0. Exit");
            System.out.println("Please choose what vehicle you wish to work with: ");
            vehicleOption = read.nextInt();
            System.out.println();

            switch (vehicleOption) {
                case 1:
                    do {
                        System.out.println("____________***********____________");
                        System.out.println("------------Motorcycles------------");
                        System.out.println("************___________************");
                        System.out.println("1. Add motorcycle");
                        System.out.println("2. Remove motorcycle");
                        System.out.println("3. Show motorcycle list");
                        System.out.println("4. Search motorcycle by license key");
                        System.out.println("5. Show average speed");
                        System.out.println("0. Return to vehicle selection");
                        System.out.println("Please choose an operation.");
                        operationOption = read.nextInt();
                        switch (operationOption) {
                            case 1:

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Invalid option, please input a different option");
                                System.out.println();
                                break;
                        }
                    } while (operationOption != 0);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option, please input a different option");
                    System.out.println();
                    break;
            }
        } while (vehicleOption != 0);
    }

    public static Motorcycle readMotorcycle() {
        Motorcycle motorcycle = new Motorcycle();

        Scanner read = new Scanner(System.in);
        System.out.println("Input a brand: ");
        motorcycle.setBrand(read.next());
        System.out.println("Input a model: ");
        motorcycle.setModel(read.next());
        System.out.println("Input a license plate: ");
        motorcycle.setLicensePlate(read.next());
        System.out.println("Input the vehicle's speed: ");
        motorcycle.setSpeed(read.nextInt());

        return motorcycle;
    }
}
