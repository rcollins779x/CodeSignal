package _1322.Labs.Lab7;

import java.util.Scanner;

class CalculatorTestDriver {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        int menu;
        double x=0,y=0;

        do {
            System.out.println("0. Exit");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choose an option: ");
            menu = (int)scan.nextDouble(); scan.nextLine();

            if (menu > 0 && menu < 5) {
                System.out.print("x = ");
                x = scan.nextDouble(); scan.nextLine();
                System.out.print("y = ");
                y = scan.nextDouble(); scan.nextLine();
            }

            switch (menu) {
                case 0 : System.out.println("Bye!");
                case 1 : System.out.println(calc.add(x,y));
                case 2 : System.out.println(calc.subtract(x,y));
                case 3 : System.out.println(calc.multiply(x,y));
                case 4 : System.out.println(calc.divide(x,y));
                default : System.out.println("Invalid Option.");
            }
        } while (menu != 0);
        scan.close();
    }
}
