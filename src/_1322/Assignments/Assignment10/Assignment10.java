//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment10;

import java.util.Scanner;

class Assignment10 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        do {                                                    //Loop while !DONE
            System.out.println("Enter strings. When finished enter DONE");
            name = scan.nextLine();
            try {                                               //Check response length if less than 20
                if (name.length() < 20) System.out.println("You entered: " + name); else throw new ManyCharactersException();
            } catch (ManyCharactersException error) {
                System.out.println("You entered too many characters");
            } catch (Exception error) {
                System.out.println("What did you do to break the program this badly? Stop it!");
            }
        } while (!name.equals("DONE"));                         //Exiting loop if DONE
        System.out.println("Good bye!");
    }
}
