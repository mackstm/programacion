package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extract phone numbers with +XX-XXX-XX-XX-XX format from a given string
 * @author Jose Maximiliano Boada Martin
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String phoneNumbers = "111222333 +11-243-45-54-54 3545086049 34568340567802946 +11-243-45-59-54 +11-243-41-54-54";
        String regex = "\\+(\\d{2}-\\d{3}-\\d{2}-\\d{2}-\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumbers);

        while (matcher.find()) {
            String matchingNumber = matcher.group();
            System.out.println(matchingNumber);
        }
    }
}
