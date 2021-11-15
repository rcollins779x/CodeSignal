//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab4BankAccount;

class SavingAccount extends BankAccount {
    SavingAccount(){
        super();
    }

    //Overloaded Constructor
    SavingAccount(String accountNumber, int balance) {
        super(accountNumber, balance);
    }

    void Deposit(double deposit) {
        super.Deposit(deposit);
    }

    @Override
    void Withdraw(int Withdraw) {
        System.out.println("You cannot withdraw from your savings account.\n");
    }

    @Override
    void addInterest(double rate) {
        double interestRate = rate / 100;
        double interest = getBalance() * interestRate ;
        System.out.println("Interest calculated: " + String.format("%.2f",interest));
        Deposit(interest);
        System.out.println("your balance with interest is " + String.format("%.2f",getBalance()));
    }
    public String toString() {
        return "This will never be seen by the end user.\n";
    }
}