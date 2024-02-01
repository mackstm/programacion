package es.ies.puerto.vehicles;

import es.ies.puerto.abstracts.Vehicle;

import java.util.*;

/**
 * Concessionaire class with cars and motorcycles
 * @author Jose Maximiliano Boada Martin
 */

public class Concessionaire {
    /**
     * Properties
     */
    Set<Car> cars;
    List<Motorcycle> motorcycles;
    Map<String, Truck> trucks;
    Map<String, Bicycle> bicycles;

    /**
     * Default constructor
     */
    public Concessionaire() {
        cars = new HashSet<>();
        motorcycles = new ArrayList<>();
        trucks = new HashMap<>();
        bicycles = new HashMap<>();
    }

    /**
     * Constructor with all parameters
     * @param cars of concessionaire
     * @param motorcycles of concessionaire
     */
    public Concessionaire(Set<Car> cars, List<Motorcycle> motorcycles, Map<String, Truck> trucks,
                          Map<String, Bicycle> bicycles) {
        this.cars = cars;
        this.motorcycles = motorcycles;
        this.trucks = trucks;
        this.bicycles = bicycles;
    }

    /**
     * Getters and setters
     */
    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public List<Motorcycle> getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(List<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }

    public Map<String, Truck> getTrucks() {
        return trucks;
    }

    public void setTrucks(Map<String, Truck> trucks) {
        this.trucks = trucks;
    }

    public Map<String, Bicycle> getBicycles() {
        return bicycles;
    }

    public void setBicycles(Map<String, Bicycle> bicycles) {
        this.bicycles = bicycles;
    }

    /**
     * Adds motorcycle to list checking if it already exists
     * @param motorcycle to add
     * @return true or false
     */
    public boolean addMotorcycle(Motorcycle motorcycle) {
        if (motorcycles.contains(motorcycle)) {
            return true;
        }
        return motorcycles.add(motorcycle);
    }

    /**
     * Removes motorcycle form list
     * @param motorcycle to remove
     * @return true or false
     */
    public boolean removeMotorcycle(Motorcycle motorcycle) {
        if (motorcycles.contains(motorcycle)) {
            return true;
        }
        return motorcycles.remove(motorcycle);
    }

    /**
     * Searches for motorcycle in list
     * @param licensePlate for searching
     * @return motorcycle
     */
    public Motorcycle obtainMotorcycle(String licensePlate) {
        Vehicle motorcycle = new Motorcycle(licensePlate);
        for (Motorcycle element : motorcycles) {
            if (element.equals(motorcycle)) {
                return element;
            }
        }
        return null;
    }

    /**
     * Calculates average speed of motorcycles in list
     * @return average speed of motorcycles
     */
    public float averageMotorcycleSpeed() {
        float result = 0f;
        if (motorcycles.isEmpty()) {
            return result;
        }

        for (Motorcycle motorcycle : motorcycles) {
            result += motorcycle.getSpeed();
        }
        return result / motorcycles.size();
    }

    /**
     * Adds car to set, checking if element already exists
     * @param car to add
     * @return true or false
     */
    public boolean addCar(Car car) {
        if (cars.contains(car)) {
            return true;
        }

        return cars.add(car);
    }

    /**
     * Removes car from set
     * @param car to remove
     * @return true or false
     */
    public boolean removeCar(Car car) {
        if (cars.contains(car)) {
            return true;
        }

        return cars.remove(car);
    }

    /**
     * Searches for car in set
     * @param licensePlate for searching
     * @return car
     */
    public Car obtainCar(String licensePlate) {
        Vehicle car = new Car(licensePlate);
        for (Car element : cars) {
            if (element.equals(car)) {
                return element;
            }
        }
        return null;
    }

    /**
     * Calculates average speed of cars in list
     * @return average speed of cars
     */
    public float averageCarSpeed() {
        float result = 0f;
        if (cars.isEmpty()) {
            return result;
        }

        for (Car car : cars) {
            result += car.getSpeed();
        }
        return result / cars.size();
    }

    /**
     * Adds truck to map, checking if element already exists
     * @param truck to add
     * @return true or false
     */
    public boolean addTruck(Truck truck) {
        if (trucks.containsValue(truck)) {
            return true;
        }
        trucks.put(truck.getLicensePlate(), truck);
        return false;
    }

    /**
     * Removes truck from map
     * @param truck to remove
     * @return true or false
     */
    public boolean removeTruck(Truck truck) {
        if (trucks.containsValue(truck)) {
            return true;
        }
        trucks.remove(truck.getLicensePlate());
        return false;
    }

    /**
     * Searches for truck in map
     * @param licensePlate for searching
     * @return truck
     */
    public Truck obtainTruck(String licensePlate) {
        if (trucks.containsKey(licensePlate)) {
            return trucks.get(licensePlate);
        }
        return null;
    }

    /**
     * Method that calculates average speed of trucks
     * @return average speed
     */
    public float averageTruckSpeed() {
        float result = 0f;
        if (trucks.isEmpty()) {
            return result;
        }

        for (Truck truck : trucks.values()) {
            result += truck.getSpeed();
        }
        return result / trucks.size();
    }

    /**
     * Adds bicycle to map, checking if element already exists
     * @param bicycle to add
     * @return true or false
     */
    public boolean addBicycle(Bicycle bicycle) {
        if (bicycles.containsValue(bicycle)) {
            return true;
        }
        bicycles.put(bicycle.getLicensePlate(), bicycle);
        return false;
    }

    /**
     * Removes bicycle from map
     * @param bicycle to remove
     * @return true or false
     */
    public boolean removeBicycle(Bicycle bicycle) {
        if (bicycles.containsValue(bicycle)) {
            return true;
        }
        bicycles.remove(bicycle.getLicensePlate());
        return false;
    }

    /**
     * Searches for bicycle in map
     * @param licensePlate for searching
     * @return bicycle
     */
    public Bicycle obtainBicycle(String licensePlate) {
        if (bicycles.containsKey(licensePlate)) {
            return bicycles.get(licensePlate);
        }
        return null;
    }

    /**
     * Method that calculates average speed of bicycles
     * @return average speed
     */
    public float averageBicycleSpeed() {
        float result = 0f;
        if (bicycles.isEmpty()) {
            return result;
        }

        for (Bicycle bicycle : bicycles.values()) {
            result += bicycle.getSpeed();
        }
        return result / bicycles.size();
    }

    @Override
    public String toString() {
        return "{Cars: " + cars +
                ", Motorcycles: " + motorcycles +
                ", Trucks: " + trucks +
                ", Bicycles: " + bicycles + "}";
    }
}
