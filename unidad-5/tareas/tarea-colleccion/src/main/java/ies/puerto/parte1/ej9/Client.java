package ies.puerto.parte1.ej9;

import java.util.Objects;

/**
 * Client class
 * @author Jose Maximiliano Boada Martin
 */
public class Client {
    /**
     * Properties
     */
    private String name;
    private String clientNumber;
    private float balance;

    /**
     * Default constructor
     */
    public Client() {}

    /**
     * Constructor with name and number parameters
     * @param name of client
     * @param clientNumber self-explanatory
     */
    public Client(String name, String clientNumber) {
        this.name = name;
        this.clientNumber = clientNumber;
    }

    /**
     * Constructor with all relevanr parameters
     * @param name of client
     * @param clientNumber self-explanatory
     * @param balance of client
     */
    public Client(String name, String clientNumber, float balance) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.balance = balance;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * Updates balance
     * @param amount added or subtracted
     */
    public void updateBalance(float amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Client name: " + name + ", client number: " + clientNumber + ", balance: " + balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return Objects.equals(clientNumber, client.clientNumber);
    }

    @Override
    public int hashCode() {
        return clientNumber != null ? clientNumber.hashCode() : 0;
    }
}
