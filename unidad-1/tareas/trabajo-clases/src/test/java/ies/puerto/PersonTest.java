package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void personDetailsTestOK() {
        Person person = new Person("Maxi", 23, "maxibapl@gmail.com", "665665665");
        String result = person.printDetails();
        String resultOK = "Name: Maxi\nAge: 23\nEmail: maxibapl@gmail.com\nPhone number: 665665665";
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }
}
