package ies.puerto;

/**
 * Bank class
 * @author Jose Maximiliano Boada Martin
 */
public class Bank {
    /**
     * Properties
     */
    private int accountNumber;
    private String accountOwnerName;
    private float amount;

    /**
     * Default constructor
     */
    public Bank() {}

    /**
     * Constructor with account number, owner and total amount parameters
     * @param accountNumber account ID
     * @param accountOwnerName client of bank
     * @param amount total amount in account
     */
    public Bank(int accountNumber, String accountOwnerName, float amount) {
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.amount = amount;
    }

    /**
     * Getters and setters
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * Method to deposit money
     * @param depositAmount self-descriptive
     */
    public void depositMoney(float depositAmount) {
        amount += Math.abs(depositAmount);
    }

    /**
     * Method to withdraw money
     * @param withdrawalAmount self-descriptive
     */
    public void withdrawMoney(float withdrawalAmount) {
        amount -= Math.abs(withdrawalAmount);
    }
}
