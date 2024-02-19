package es.ies.puerto.presentation;

import java.util.Objects;

public abstract class Product {
    private String id;
    private String name;
    private float price;
    private String dEntry;
    private String dExpiry;

    public Product() {}

    public Product(String id, String name, float price, String dEntry, String dExpiry) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dEntry = dEntry;
        this.dExpiry = dExpiry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getdEntry() {
        return dEntry;
    }

    public void setdEntry(String dEntry) {
        this.dEntry = dEntry;
    }

    public String getdExpiry() {
        return dExpiry;
    }

    public void setdExpiry(String dExpiry) {
        this.dExpiry = dExpiry;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dEntry='" + dEntry + '\'' +
                ", dExpiry='" + dExpiry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
