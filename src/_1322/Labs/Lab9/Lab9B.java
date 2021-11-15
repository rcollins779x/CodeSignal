//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab9;

import java.text.DecimalFormat;
import java.util.Scanner;

class Lab9B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat comma = new DecimalFormat("#,###");
        int i, j;

        do {
            System.out.println("Please enter a value for i");
            i = scan.nextInt(); scan.nextLine();
            System.out.println("Please enter a value for j");
            j = scan.nextInt(); scan.nextLine();
        } while (i < 1 || j < 1);

        System.out.println(i + "*" + j + " = " + comma.format(IntegerMultiply(i,j)));
    }

    private static int IntegerMultiply(int i, int j) {
        if (j == 1) return i;
        return i + IntegerMultiply(i,--j);
    }
}
