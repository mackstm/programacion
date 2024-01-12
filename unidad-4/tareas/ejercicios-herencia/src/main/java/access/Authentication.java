package access;

import exceptions.ValidationException;

import java.util.Scanner;

/**
 * Authentication class with methods to authenticate users
 * @author Jose Maximiliano Boada Martin
 */
public class Authentication {

    /**
     * Input read for authentication. Template for children to override
     * @return input
     */
    public String readInput() {
        return "";
    }

    /**
     * User validation. Template for children to override.
     */
    public void validateUser() throws ValidationException{
        throw new ValidationException("INVALID USER");
    }
}
