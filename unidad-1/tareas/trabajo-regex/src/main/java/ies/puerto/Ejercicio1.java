package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validate if a given string of text is a valid email
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Input a valid email: ");
        String email = read.next();

        String regex = "^[a-zA-Z\\d._%+-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        System.out.println((matcher.matches()) ? "The email address is valid" : "The email address is not valid");
    }
}
