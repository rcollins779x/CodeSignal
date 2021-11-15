package NumberGuess;

import java.util.Scanner;

class NumGuess {
    static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int lowB = scan.nextInt();
        int highB = scan.nextInt();
        int tries = scan.nextInt();
        System.out.println(t + "0\t0"+lowB+"0\t0"+highB);
    }
}
