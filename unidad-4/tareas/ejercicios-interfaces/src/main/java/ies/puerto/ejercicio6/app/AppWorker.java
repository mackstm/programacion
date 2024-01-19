package ies.puerto.ejercicio6.app;

import ies.puerto.ejercicio6.impl.Professor;
import ies.puerto.ejercicio6.impl.Student;

/**
 * Checks functionality for worker interface and all implementations
 * @author Jose Maximiliano Boada Martin
 */
public class AppWorker {
    static Professor professor;
    static Student student;
    public static void main(String[] args) {
        professor = new Professor("Pepe", "01/01/1980", 1050f, "professor", "IT");
        student= new Student("Pepito", "01/01/2000", "1ºDAM");
    }
}
