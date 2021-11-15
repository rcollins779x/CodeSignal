//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment6;

abstract class Ticket {
    static private int NextTicketNumber=1;

    abstract int getPrice();
    abstract void setPrice();

    Ticket() {
        setTicketNumber(NextTicketNumber);
    }
    Ticket(int notUsed) {
        setTicketNumber(NextTicketNumber);
    }   //Impossible to be accessed

    static void setTicketNumber(int ticketNumber) {
        Ticket.NextTicketNumber = ticketNumber;
    }

    static int getTicketNumber() {
        return NextTicketNumber++;
    }

    @Override                                                   //Impossible to be accessed
    public String toString() {
        return "Ticket # " + NextTicketNumber + " with a price of $" + getPrice() + " for a game today.";
    }
}
