//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab11;

import java.util.Scanner;

class Lab11B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String again;
        do {
            System.out.println("Enter time in 24-hour notation:");
            String input = scan.next();
            int hour;
            try {                                                   //Checks if input is valid
                if(!input.matches("\\d{4}")) throw new InvalidTimeFormatException("24-hour notation requires 4 numbers");
                if(!input.matches("^[01]\\d.*|^[2][0-3].*"))
                    throw new InvalidTimeFormatException("Hour can only be between 0 and 23");
                if(!input.matches(".*[0-5]\\d$"))
                    throw new InvalidTimeFormatException("Minutes can only be between 0 and 59");
                hour = Integer.parseInt(input.substring(0, 2));
                System.out.println("That is the same as " + ((hour+11)%12+1) + ":" + input.substring(2) + (hour > 11 ? " PM" : " AM"));
            } catch (InvalidTimeFormatException error) {            //If input is not valid, output appropriate error message
                System.out.println(error.getMessage());
            }
            do {
                System.out.println("Again?(y/n)");                  //Loop until proper response is entered
                again = scan.next().toLowerCase();
            } while (again.matches("[yn]"));
        } while (again.matches("y"));                         //Repeat or exit
    scan.close();
    }
}