//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment6;
import java.util.*;

class PurchaseTicket_Driver {
    private static final ArrayList<Ticket> array= new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ticket ticket = new CurrentBooking(0); ticket.getPrice();
        ticket = new AdvanceBooking(); ticket.getPrice();
        ticket = new DiscountBooking();
        Ticket.setTicketNumber(1);

        int menu, daysTillGame = 0;

        do {
            System.out.println("1. Sell a ticket for a future game");
            System.out.println("2. Sell a Ticket for today's game");
            System.out.println("3. Sell a Discount Ticket");
            System.out.println("4. Print All Tickets");
            System.out.println("5. Exit");
            menu = scan.nextInt(); scan.nextLine();

            if (menu == 1 || menu == 3) {
                System.out.println("How many days until the game? (0 for today)");
                daysTillGame = scan.nextInt(); scan.nextLine();
                if (daysTillGame == 0) menu = 2;
            }

            switch (menu) {
                case 1 : array.add(ticket = new AdvanceBooking(daysTillGame));
                case 2 : array.add(ticket = new CurrentBooking());
                case 3 : array.add(ticket = new DiscountBooking(daysTillGame));
                case 4 : Print();
                default : System.out.println("Invalid choice");
            }
            if( 0 < menu && menu < 4) System.out.println("You sold: " + ticket);
        } while (menu != 5);
        scan.close();
    }
    static void Print() {
        if(array.size() == 0) System.out.println("No tickets have been sold.");
        else {
            System.out.println("Here are all the tickets you sold:");
            for (Object tickets : array)
                System.out.println(tickets);
        }
    }
}
