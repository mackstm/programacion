package es.ies.puerto.presentation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppLibrary {
    public static void main(String[] args) {
        System.out.println(lectura("src/main/resources/avocado.csv"));

    }

    // Ejemplo básico de lectura de ficheros linea a linea
    public static List<Product> lectura(String path) {
        List<Product> products = new ArrayList<>();
        // Crear un objeto File
        File fichero = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i > 0) {
                        String[] foodArray = linea.split(",");
                        Food food = new Food(foodArray[3], foodArray[0], Float.parseFloat(foodArray[1]), foodArray[2],
                                foodArray[4]);
                        products.add(food);
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return products;
    }
}
