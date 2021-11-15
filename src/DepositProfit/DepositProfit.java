package DepositProfit;

class DepositProfit {
    static void main(String[] args) {
        int deposit = 100, rate = 20, threshold = 170;
        System.out.println(depositProfit(deposit,rate,threshold));
    }
    static int depositProfit(int deposit, int rate, int threshold) {
        int years=0;
        double balance = deposit;
        double r = 1 + (double)rate/100;
        while (balance < threshold) {
            balance *= r;
            years++;
            System.out.println(balance + " " + years);
        }
        return years;
    }
}
