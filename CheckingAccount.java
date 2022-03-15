public class CheckingAccount {
    private double balance;
    private int accountNumber;

    public CheckingAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount){throw new InsufficientFundsException(amount-balance);}
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
