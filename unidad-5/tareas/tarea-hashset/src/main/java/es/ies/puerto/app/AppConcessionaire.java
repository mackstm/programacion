package es.ies.puerto.app;

import es.ies.puerto.vehicles.*;

import java.util.Scanner;

/**
 * App that tests functionalities of vehicle interface and all derivatives
 * @author Jose Maximiliano Boada Martin
 */

public class AppConcessionaire {
    public static void main(String[] args) {

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
            System.out.println("5. List all current vehicles");
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
                        System.out.println("4. Search motorcycle by license plate");
                        System.out.println("5. Show average speed");
                        System.out.println("0. Return to vehicle selection");
                        System.out.println("Please choose an operation.");
                        operationOption = read.nextInt();
                        switch (operationOption) {
                            case 1:
                                Motorcycle motorcycle = new Motorcycle(readBrand(), readModel(), readLicense(),
                                        readSpeed());
                                concessionaire.addMotorcycle(motorcycle);
                                break;
                            case 2:
                                Motorcycle motorcycleToRemove = concessionaire.obtainMotorcycle(readLicense());
                                concessionaire.removeMotorcycle(motorcycleToRemove);
                                break;
                            case 3:
                                System.out.println(concessionaire.getMotorcycles());
                                break;
                            case 4:
                                System.out.println(concessionaire.obtainMotorcycle(readLicense()));
                                break;
                            case 5:
                                System.out.println(concessionaire.averageMotorcycleSpeed());
                                break;
                            default:
                                System.out.println("Invalid option, please input a different option");
                                System.out.println();
                                break;
                        }
                    } while (operationOption != 0);
                    break;
                case 2:
                    do {
                        System.out.println("____________****____________");
                        System.out.println("------------Cars------------");
                        System.out.println("************____************");
                        System.out.println("1. Add car");
                        System.out.println("2. Remove car");
                        System.out.println("3. Show car set");
                        System.out.println("4. Search car by license plate");
                        System.out.println("5. Show average speed");
                        System.out.println("0. Return to vehicle selection");
                        System.out.println("Please choose an operation.");
                        operationOption = read.nextInt();
                        switch (operationOption) {
                            case 1:
                                Car car = new Car(readBrand(), readModel(), readLicense(), readSpeed());
                                concessionaire.addCar(car);
                                break;
                            case 2:
                                Car carToRemove = concessionaire.obtainCar(readLicense());
                                concessionaire.removeCar(carToRemove);
                                break;
                            case 3:
                                System.out.println(concessionaire.getCars());
                                break;
                            case 4:
                                System.out.println(concessionaire.obtainCar(readLicense()));
                                break;
                            case 5:
                                System.out.println(concessionaire.averageCarSpeed());
                                break;
                            default:
                                System.out.println("Invalid option, please input a different option");
                                System.out.println();
                                break;
                        }
                    } while (operationOption != 0);
                    break;
                case 3:
                    do {
                        System.out.println("____________******____________");
                        System.out.println("------------Trucks------------");
                        System.out.println("************______************");
                        System.out.println("1. Add truck");
                        System.out.println("2. Remove truck");
                        System.out.println("3. Show truck map");
                        System.out.println("4. Search truck by license plate");
                        System.out.println("5. Show average speed");
                        System.out.println("0. Return to vehicle selection");
                        System.out.println("Please choose an operation.");
                        operationOption = read.nextInt();
                        switch (operationOption) {
                            case 1:
                                 Truck truck = new Truck(readBrand(), readModel(), readLicense(), readSpeed());
                                concessionaire.addTruck(truck);
                                break;
                            case 2:
                                Truck truckToRemove = concessionaire.obtainTruck(readLicense());
                                concessionaire.removeTruck(truckToRemove);
                                break;
                            case 3:
                                System.out.println(concessionaire.getTrucks());
                                break;
                            case 4:
                                System.out.println(concessionaire.obtainTruck(readLicense()));
                                break;
                            case 5:
                                System.out.println(concessionaire.averageTruckSpeed());
                                break;
                            default:
                                System.out.println("Invalid option, please input a different option");
                                System.out.println();
                                break;
                        }
                    } while (operationOption != 0);
                    break;
                case 4:
                    do {
                        System.out.println("____________********____________");
                        System.out.println("------------Bicycles------------");
                        System.out.println("************________************");
                        System.out.println("1. Add bicycle");
                        System.out.println("2. Remove bicycle");
                        System.out.println("3. Show bicycle list");
                        System.out.println("4. Search bicycle by license plate");
                        System.out.println("5. Show average speed");
                        System.out.println("0. Return to vehicle selection");
                        System.out.println("Please choose an operation.");
                        operationOption = read.nextInt();
                        switch (operationOption) {
                            case 1:
                                Bicycle bicycle = new Bicycle(readBrand(), readModel(), readLicense(), readSpeed());
                                concessionaire.addBicycle(bicycle);
                                break;
                            case 2:
                                Bicycle bicycleToRemove = concessionaire.obtainBicycle(readLicense());
                                concessionaire.removeBicycle(bicycleToRemove);
                                break;
                            case 3:
                                System.out.println(concessionaire.getBicycles());
                                break;
                            case 4:
                                System.out.println(concessionaire.obtainBicycle(readLicense()));
                                break;
                            case 5:
                                System.out.println(concessionaire.averageBicycleSpeed());
                                break;
                            default:
                                System.out.println("Invalid option, please input a different option");
                                System.out.println();
                                break;
                        }
                    } while (operationOption != 0);
                    break;
                case 5:
                    System.out.println(concessionaire);
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

    /**
     * Returns license of vehicle
     * @return license plate
     */
    public static String readBrand() {
        Scanner read = new Scanner(System.in);
        System.out.println("Input brand: ");
        return read.next();
    }

    /**
     * Returns license of vehicle
     * @return license plate
     */
    public static String readModel() {
        Scanner read = new Scanner(System.in);
        System.out.println("Input model: ");
        return read.next();
    }

    /**
     * Returns license of vehicle
     * @return license plate
     */
    public static String readLicense() {
        Scanner read = new Scanner(System.in);
        System.out.println("Input license plate: ");
        return read.next();
    }

    /**
     * Returns license of vehicle
     * @return license plate
     */
    public static int readSpeed() {
        Scanner read = new Scanner(System.in);
        System.out.println("Input speed: ");
        return read.nextInt();
    }

}
