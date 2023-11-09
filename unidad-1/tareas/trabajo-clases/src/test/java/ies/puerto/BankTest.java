package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankTest {
    public void checkDeposit(Bank client, float deposit, float resultOK) {
        client.depositMoney(deposit);
        Assertions.assertEquals(resultOK, client.getAmount());
    }

    public void checkWithdrawal(Bank client, float withdrawal, float resultOK) {
        client.withdrawMoney(withdrawal);
        Assertions.assertEquals(resultOK, client.getAmount());
    }

    @Test
    public void depositIntTestOK() {
        Bank client = new Bank(1, "Maxi", 19);
        checkDeposit(client, 5, 24);
    }

    @Test
    public void depositFloatTestOK() {
        Bank client = new Bank(1, "Maxi", 19.70f);
        checkDeposit(client, 5.50f, 25.20f);
    }

    @Test
    public void depositNegTestOK() {
        Bank client = new Bank(1, "Maxi", 19.70f);
        checkDeposit(client, -5.50f, 25.20f);
    }

    @Test
    public void withdrawIntTestOK() {
        Bank client = new Bank(1, "Maxi", 19);
        checkWithdrawal(client, 5, 14);
    }

    @Test
    public void withdrawFloatTestOK() {
        Bank client = new Bank(1, "Maxi", 19.70f);
        checkWithdrawal(client, 10.50f, 9.200001f);
    }

    @Test
    public void withdrawNegTestOK() {
        Bank client = new Bank(1, "Maxi", 19.70f);
        checkWithdrawal(client, -10.50f, 9.200001f);
    }
}
