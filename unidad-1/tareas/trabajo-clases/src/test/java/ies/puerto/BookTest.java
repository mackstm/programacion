package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void bookDetailsTest() {
        Book myBook = new Book("My Awesome Book", "Maxi", 2023);
        String result = myBook.printDetails();
        String resultOK = "Title: My Awesome Book\nAuthor: Maxi\nYear published: 2023";
        Assertions.assertEquals(resultOK, result, "Unexpected result");
    }
}
