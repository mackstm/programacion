package es.ies.puerto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Even numbers
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio4 {
    public List<Integer> evenNumbersTrad(int number) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <= number; i += 2) {
                resultList.add(i);
        }
        return resultList;
    }

    public List<Integer> evenNumbersRecursive(int number) {
        List<Integer> result = new ArrayList<>();
        if (number % 2 == 0) {
            result.add(number);
        }
        if (number == 0) {
            return result;
        }
        result.addAll(evenNumbersRecursive(number - 1));
        Collections.reverse(result);
        return result;
    }
}