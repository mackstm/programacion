package ies.puerto;

import java.util.ArrayList;
import java.util.List;

/**
 * Store class with product list
 * @author Jose Maximiliano Boada Martin
 */
public class Store {
    /**
     * Properties
     */
    List<Product> products = new ArrayList<Product>();

    /**
     * Default constructor
     */
    public Store() {}

    /**
     * Constructor with list of products
     * @param products list
     */
    public Store(List<Product> products) {
        this.products = products;
    }

    /**
     * Getter
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Adds product to inventory
     * @param product to add
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Sells product from inventory
     * @param productID position of product to sell
     */
    public void sellProduct(int productID, int unitsSold) {
        products.get(productID).setStock(products.get(productID).getStock() - unitsSold);
    }

    /**
     * Shows full inventory
     * @return String with full inventory
     */
    public String showInventory() {
        String inventory = "";
        for (int i = 0; i < products.size(); i++) {
            inventory += "Product ID: " + (i + 1) + "\nName: " +
                products.get(i).getName() + "\nPrice: " +
                products.get(i).getPrice() + "\nStock: " +
                products.get(i).getStock() + "\n\n";
        }
        return inventory;
    }
}
