package _1322.Labs.Lab6;

import java.text.NumberFormat;
import java.util.*;

class testFib {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter the number you want to find the Fibonacci Series for: ");
            num = scan.nextInt();
            if (num > 92) System.out.println("Unable to calculate. Please enter a smaller value.");
        } while (num > 92);

        FindFib iter = new FibIteration();
        System.out.println("Iteration:\t" + num + "\t" + NumberFormat.getNumberInstance(Locale.US).format(iter.calculateFib(num)));
        if (num > 71)
            System.out.println("Be Advised: Java starts rounding above iteration 71.");
        FindFib formula = new FibFormula();
        System.out.println("Formula:\t" + num + "\t" + NumberFormat.getNumberInstance(Locale.US).format(formula.calculateFib(num)));
    }
}