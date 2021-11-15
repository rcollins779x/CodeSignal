//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab4BankAccount;

class CheckingAccount extends BankAccount{
    private int noOfTransactions, freeTransactions, fee;

    //Default Constructor
    CheckingAccount() {
        super();
    }

    //Overloaded Constructor
    CheckingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
        noOfTransactions = 0;
        freeTransactions = 5;
        fee = 10;
    }

    @Override
    void Withdraw(int withdraw) {
        noOfTransactions++;
        fee = noOfTransactions > freeTransactions ? 10 : 0;
        setBalance(getBalance() - withdraw - fee);
    }
    @Override
    int getFreeTransactions() {
        return Math.max(freeTransactions - noOfTransactions, 0);
    }

    public String toString() {
        return "This will never be seen by the end user.\n";
    }

}
