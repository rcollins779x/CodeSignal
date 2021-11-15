package Candies;

class Candies {
    static void main(String[] args) {
        int n = 3, m = 10;
        System.out.println(candies(n,m));
    }
    static int candies(int n, int m) {
        return m - m%n;
    }
}
