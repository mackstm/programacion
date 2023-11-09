package ies.puerto;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreTest {


    @Test
    public void addTestOK() {
        Store store = new Store();

        Product product1 = new Product("Avocado", 10.50f, 20);
        Product product2 = new Product("Lemon", 2.20f, 50);

        store.addProduct(product1);
        store.addProduct(product2);

        List<Product> resultOK = new ArrayList<Product>();
        resultOK.add(product1);
        resultOK.add(product2);

        Assertions.assertIterableEquals(resultOK, store.getProducts());
    }

    @Test
    public void sellTestOK() {
        Store store = new Store();

        Product product1 = new Product("Avocado", 10.50f, 20);
        Product product2 = new Product("Lemon", 2.20f, 50);

        store.addProduct(product1);
        store.addProduct(product2);
        
        store.sellProduct(1, 4);

        Product product2After = new Product("Lemon", 2.20f, 46);

        Assertions.assertEquals(product2After.getStock(), 
            store.getProducts().get(1).getStock());
    }
}
