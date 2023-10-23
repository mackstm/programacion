package ies.puerto;

/**
 * Program used to calculate a worker's monthly salary, taking into account the hourly rate is 10 euros/hour
 * @author Jose Maximiliano Boada Martin
 */

public class Ejercicio1 {

    /**
     * Function that calculates a worker's monthly salary
     * @param hoursInMonth hours worked in a month
     * @return hours * hourly rate (10)
     */
    public int calcMonthlySalary(int hoursInMonth) {
        return hoursInMonth * 10;
    }
}