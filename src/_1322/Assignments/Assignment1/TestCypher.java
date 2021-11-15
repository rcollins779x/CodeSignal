//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment1;
import java.util.*;//* or Scanner

class TestCypher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the statement to be encrypted.\n");
        String original = scan.nextLine();

        //Creates obj program1 via default Constructor
        Cypher program1 = new Cypher();
        program1.cypherMethod();
        program1.reverseMethod();
        System.out.println(program1);

        //Creates obj program2 via overloaded Constructor and passes statement
        Cypher program2 = new Cypher(original);
        program2.cypherMethod();
        program2.reverseMethod();
        System.out.println(program2);
    }
}