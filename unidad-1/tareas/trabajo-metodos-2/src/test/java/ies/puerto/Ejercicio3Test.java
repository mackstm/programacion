package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    public List<Integer> makeListOf5(int number1, int number2, int number3, int number4, int number5) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);

        return numbers;
    }

    public void checkWrite(int number1, int number2, int number3, int number4, int number5, String resultOK) {
        List<Integer> numbers = makeListOf5(number1, number2, number3, number4, number5);

        String result = ejercicio3.writeNumbers(numbers);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    public void checkSumOf5(int number1, int number2, int number3, int number4, int number5, int resultOK) {
        List<Integer> numbers = makeListOf5(number1, number2, number3, number4, number5);

        int result = ejercicio3.sumOfNumbers(numbers);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    public void checkAscendingOrder(int number1, int number2, int number3, int number4, int number5, String resultOK) {
        List<Integer> numbers = makeListOf5(number1, number2, number3, number4, number5);

        String result = ejercicio3.orderNumbersAscending(numbers);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    public void checkDescendingOrder(int number1, int number2, int number3, int number4, int number5, String resultOK) {
        List<Integer> numbers = makeListOf5(number1, number2, number3, number4, number5);

        String result = ejercicio3.orderNumbersDescending(numbers);
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }

    @Test
    public void writeNumTestOK() {
        checkWrite(2, 1, 4, 3, 5, "2 1 4 3 5");
    }

    @Test
    public void sumNumTestOK() {
        checkSumOf5(2, 1, 4, 3, 5, 15);
    }

    @Test
    public void ascendingOrderTestOK() {
        checkAscendingOrder(2, 1, 4, 3, 5, "1 2 3 4 5");
    }

    @Test
    public void descendingOrderTestOK() {
        checkDescendingOrder(2, 1, 4, 3, 5, "5 4 3 2 1");
    }
}