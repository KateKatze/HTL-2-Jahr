package at.htlpinkafeld.bankaccount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount ba;
    private BankAccount ba1;
    @BeforeEach
    void setUp() {
        ba = new BankAccount();
        ba.openAccount(1001, "Brain");
    }

    @Test
    void openAccount() {
        ba1 = new BankAccount();
        ba1.openAccount(1002, "Pinky");
    }

    @Test
    void testSetInterestRate(double interestRatePercent) {
        ba.setInterestRate(2.0);
        assertEquals(2.0, ba.getInterestRate();
    }

    @Test
    void testCalculateInterest() {
        ba.deposit(100.0);
        assertEquals(98.0, ba.calculateInterest(), 1e-6);
    }

    @Test
    void testSetTransactionFee() {
        ba.setTransactionFee(5.0);
        ba.deposit(50.5);
        assertEquals(45.5, ba.getBalance() - ba.getTransactionFee());
    }

    @Test
    void testDeposit() {
        ba.deposit(50.5);
        assertEquals(50.5, ba.getBalance(), 1e-6); // 0.000001 = 1e-6
    }

    @Test
    void testWithdraw() {
            assertFalse(ba.withdraw(5), "Invalid withdraw");
            assertEquals(0.0, ba.getBalance(), "Zero balance");
            ba.deposit(50);
            assertTrue(ba.withdraw(5), "Valid withdraw");
            assertEquals(50-5, ba.getBalance(), "New balance");
    }

    @Test
    void testTransactionCounter(){ //number of transactions
            ba.withdraw(10); //cant because no money
            assertEquals(0, ba.getNumberOfTransactions(), "no transaction");
            ba.deposit(50);
            assertEquals(1, ba.getNumberOfTransactions(), "1");
            ba.withdraw(5);
            assertEquals(2, ba.getNumberOfTransactions(), "2");
    }

    @Test
    void testMonthlyProcess() {
    }
}