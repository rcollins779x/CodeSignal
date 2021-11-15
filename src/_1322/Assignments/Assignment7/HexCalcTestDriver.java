package _1322.Assignments.Assignment7;

import java.util.Scanner;

class HexCalcTestDriver {    //Same as testCalculator in Rubric
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String x = "", y = "";
        int hex, menu;

        do {
            System.out.println("What type of calculation do you want?\n1. Decimal\n2. Hexadecimal");
            hex = (int) scan.nextDouble(); scan.nextLine();
            if (hex == 2) calc = new HexCalc();
        } while (hex < 1 || hex > 2);

        do {
            System.out.println("0. Exit");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choose an option: ");
            menu = scan.nextInt(); scan.nextLine();

            if (menu > 0 && menu < 5) {
                System.out.print("x = ");
                x = scan.nextLine();
                System.out.print("y = ");
                y = scan.nextLine();
            }

            switch (menu) {
                case 0 : System.out.println("Bye!");
                case 1 : System.out.println(x + " + " + y + " = " + calc.add(x,y));
                case 2 : System.out.println(x + " - " + y + " = " + calc.subtract(x,y));
                case 3 : System.out.println(x + " * " + y + " = " + calc.multiply(x,y));
                case 4 : System.out.println(x + " / " + y + " = " + calc.divide(x,y));
                default : System.out.println("Invalid Option.");
            }
        } while (menu != 0);
        scan.close();
    }
}
