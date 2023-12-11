package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to validate emails
 * @author Jose Maximiliano Boada Martin
 */
public class Email {

    public static void main(String[] args) {
        Email email = new Email();
        email.readEmail();

        try {
            email.validateEmail();
            System.out.println("Email is valid!");
        } catch(InvalidEmailException e) {
            System.out.println("This email is not valid, please restart the program and input a valid one");
        }
    }

    /**
     * Properties
     */
    private String emailName;

    /**
     * Default Constructor
     */
    public Email() {}

    /**
     * Constructor with email string parameter
     * @param emailName string
     */
    public Email(String emailName) {
        this.emailName = emailName;
    }

    /**
     * Getters and setters
     */
    public String getEmail() {
        return emailName;
    }

    public void setEmail(String emailName) {
        this.emailName = emailName;
    }

    /**
     * Method to read string from keyboard
     */
    public void readEmail() {
        Scanner read = new Scanner(System.in);
        System.out.println("Input a valid email: ");
        this.emailName = read.next();
    }

    /**
     * Checks whether an email is valid
     * @throws InvalidEmailException to check if email is valid
     */
    public void validateEmail() throws InvalidEmailException{
        String regex = "[a-zA-Z\\d._%+-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z][a-zA-Z]+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailName);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Not a valid email");
        }
    }
}