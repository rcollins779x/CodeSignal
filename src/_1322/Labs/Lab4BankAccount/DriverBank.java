//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab4BankAccount;

import java.util.*;



class DriverBank {

    public static void main(String[] args) {
        int menu, balance = 0;
        BankAccount account = null;
        assert false;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("0. Exit");
            System.out.println("1. Create a Checking Account");
            System.out.println("2. Create a Savings Account");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Check Balance");
            System.out.print("Please choose an option: ");

            menu = scan.nextInt(); scan.nextLine();

            if(menu == 1 || menu == 2)
                do {
                    System.out.print("Enter the initial balance (" + (500 * menu) + " minimum): ");
                    balance = scan.nextInt(); scan.nextLine();
                    if (balance < 500 * menu) System.out.println("Minimum balance too low. please give us more money.");
                } while (balance < 500 * menu);
             else if (ThereIsNo(account)) continue;

            switch (menu) {
                case 1 : account = new CheckingAccount("Chek", balance);
                case 2 : {
                    account = new SavingAccount("Save", balance);
                    System.out.println("What is the interest rate? ");
                    double interest = Math.max(scan.nextDouble(),0); scan.nextLine();
                    account.addInterest(interest);
                }
                case 3 : {
                    int withdraw = 0;

                    if(account.getAccountNumber().charAt(0) == 67) {
                        System.out.println("Current balance: " + String.format("%.2f",account.getBalance()));
                        System.out.println("If you withdraw more than 5 times then you will be charged a 10 fee from the amount withdrawn.");
                        System.out.println("How much do you want to withdraw? (free transactions left:" + account.getFreeTransactions());
                        withdraw = scan.nextInt(); scan.nextLine();
                    }
                    account.Withdraw(withdraw);

                }
                case 4 : {
                    System.out.print("How much do you want to deposit? ");
                    int deposit = scan.nextInt(); scan.nextLine();

                    account.Deposit(deposit);
                }
                case 5 : System.out.println("Account #" + account.getAccountNumber() + "\nYour balance is : " + String.format("%.2f",
                        account.getBalance()));
            }
        } while (menu != 0);
        System.out.println("Thank You for banking with us!");
        scan.close();
    }
    static boolean ThereIsNo(BankAccount account) {
        if(Objects.equals(account, null)) {
            System.out.println("Please create an account first.");
            return true;
        } else return false;
    }
}
