package at.htlpinkafeld.bankaccount;

public class BankAccount {
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    protected int accountNumber;
    protected String accountOwner;
    protected double balance;
    protected double interestRate;
    protected int numberOfTransactions;
    protected double transactionFee;

    public BankAccount() {
        this.balance = 0;
    }

    public void setInterestRate(double interestRatePercent) {
        this.interestRate = interestRatePercent;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public void openAccount(int number, String name) {
        this.accountNumber = number;
        this.accountOwner = name;
        this.balance = 0;
        this.numberOfTransactions = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.numberOfTransactions++;
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.numberOfTransactions++;
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void showAccount() {
        System.out.println("Bank Account Number: " + this.accountNumber);
        System.out.println("Owner: " + this.accountOwner);
    }

    public void monthlyProcess() { //fehler
        this.balance -= this.numberOfTransactions * this.transactionFee;
        this.balance += this.calculateInterest();
    }

    public double calculateInterest() { //fehler ; intesest - zinsen
        return this.interestRate * 100.0 / this.balance;
    }
}
