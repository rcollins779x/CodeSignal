package FactorialWithComma;

import java.math.BigInteger;
import java.util.Scanner;

import static java.math.BigInteger.*;

class FactorialWithComma {
    static void main (String[] args) {
        BigInteger fact = new BigInteger("1");
        int test;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("0. Exit\tEnter a number.");
            String text = scan.nextLine();
            test = text.indexOf("!");
            if (test == -1) System.out.println(test = Integer.parseInt(text));
            else {
                int num = Integer.parseInt(text.substring(0, text.length() - 1));
                System.out.print("Calculate: " + num + "! = ");

                for (int i = 1; i <= num; i++) fact = fact.multiply(valueOf(i));
                }
            System.out.println(fact);

            System.out.println(" comma: " + comma(String.valueOf(fact)));
            fact = valueOf(1);
        } while (test != 0);
        scan.close();
    }

    private static String comma (String answer) {
        StringBuilder comma = new StringBuilder();
        for (int i = 0; i < answer.length(); i++)
            comma.append((i > 0 && i % 3 == 0) ? "," : "").append(answer.charAt(answer.length()-i-1));
        return String.valueOf(comma.reverse());
    }
}
