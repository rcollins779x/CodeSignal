//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab4BankAccount;

class BankAccount {
    private String accountNumber;
    private double balance;
    private static int accountGen = 1000;

    //Default Constructor
    BankAccount() {
        this("",0);
    }
    //Overloaded Constructor
    BankAccount(String accountType, int balance) {
        accountNumber = accountType + (++accountGen);
        this.balance = Math.max(balance,0);
    }

    //Getters
    String getAccountNumber() {
        return accountNumber;
    }
    double getBalance() {
        return balance;
    }

    //Setters
    void setAccountNumber(String accountType) {
        accountNumber = accountType + (++accountGen);
    }
    void setBalance(double balance) {
        this.balance = Math.max(balance,0);
    }

    void Deposit(double deposit) {
        balance += Math.max(deposit,0);
    }
    void Withdraw(int withdraw) {
        balance -= Math.max(withdraw,0);
    }
    void addInterest(double interest) {

    }

    @Override   //toString override
    public String toString() {
        return "Account Number :\t" + accountNumber + "\n" +
                "Account Balance :\t\t" + balance + "\n";
    }

    int getFreeTransactions() {
        return 0;
    }
}
