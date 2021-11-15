//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab9;

import java.text.DecimalFormat;
import java.util.Scanner;

class Lab9A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat comma = new DecimalFormat("#,###");
        int x, y;

            System.out.println("Please enter a value for x");
            x = scan.nextInt(); scan.nextLine();
        do {
            System.out.println("Please enter a value for y");
            y = scan.nextInt(); scan.nextLine();
        } while (y <= 0);

        System.out.println(x + "^" + y + " = " + comma.format(CalculateExponent(x,y)));
    }

    private static int CalculateExponent(int x, int y) {
        if (y == 1) return x;
        return x * CalculateExponent(x,--y);
    }
}
