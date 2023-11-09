package ies.puerto;

/**
 * Products for Store class
 * @author Jose Maximiliano Boada Martín
 */
public class Product {
    /**
     * Properties
     */
    private String name;
    private float price;
    private int stock;

    /**
     * Default constructor
     */
    public Product() {}

    /**
     * Constructor with name, price and stock parameters
     * @param name of product
     * @param price of product
     * @param stock amount of product
     */
    public Product(String name, float price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
