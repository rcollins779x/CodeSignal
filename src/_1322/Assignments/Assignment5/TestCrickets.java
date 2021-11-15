//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment5;

import java.util.*;

class TestCrickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Environment e = new Environment(60);
        Cricket cktObj = new Cricket();
        System.out.println("Normal cricket: " + e.getTemp() +
                " degrees yields " + cktObj.getChirpCount(e) + " chirps per minute");

        e.setTemp(70);
        Cricket clemsonCktObj = new ClemsonCricket();
        System.out.println("Clemson cricket: " + e.getTemp() + " degrees yields "
                + clemsonCktObj.getChirpCount(e) + " chirps per minute");
        do {
            System.out.print("Enter the temperature: ");
            int temp = scan.nextInt(); scan.nextLine();

            if(temp < 10) {
                System.out.println("Temperature is too cold for crickets to chirp.");
                continue;
            }

            e.setTemp(temp);

            System.out.println("0. Exit\n1. Normal Cricket\n2. Clemson Cricket\n3. Both Crickets");
            int choice = scan.nextInt(); scan.nextLine();

            if(choice < 0 || choice > 3) {
                System.out.println("Please try again.");
                continue;
            }
            if(choice == 0) break;

            if (choice == 1 || choice == 3)
                    System.out.println("Normal cricket: " + e.getTemp() +
                        " degrees yields " + cktObj.getChirpCount(e) + " chirps per minute");

            if (choice == 2 || choice == 3)
                    System.out.println("Clemson cricket: " + e.getTemp() + " degrees yields "
                            + clemsonCktObj.getChirpCount(e) + " chirps per minute");
        } while (true);
        scan.close();
    }
}
