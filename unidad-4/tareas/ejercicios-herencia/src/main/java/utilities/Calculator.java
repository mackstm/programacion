package utilities;

import java.util.Scanner;

/**
 * Child of CalcUtilities
 * @author Jose Maximiliano Boada Martin
 */
public class Calculator extends CalcUtilities{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner read = new Scanner(System.in);

        System.out.println("Input value A: ");
        float valueA = read.nextFloat();
        System.out.println("Input value B: ");
        float valueB = read.nextFloat();

        System.out.println("Choose an operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Input any other key to exit");
        int option = read.nextInt();

        switch(option) {
            case 1:
                System.out.println(calculator.add(valueA, valueB));
                break;
            case 2:
                System.out.println(calculator.subtract(valueA, valueB));
                break;
            case 3:
                System.out.println(calculator.multiply(valueA, valueB));
                break;
            case 4:
                System.out.println(calculator.divide(valueA, valueB));
                break;
            default:
                System.out.println("Exiting...");
                break;
        }
    }
}
