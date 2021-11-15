//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment6;

class CurrentBooking extends Ticket {
    private final int ticketNumber;
    private int price;

    CurrentBooking() {
        ticketNumber = getTicketNumber();
        setPrice();
    }

    CurrentBooking(int notUsed) {
        ticketNumber = getTicketNumber();
        price = notUsed;
        setPrice();
    }

    @Override
    void setPrice() {
        price = 75;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket # " + ticketNumber + " with a price of $" + getPrice() +
                " for a game today.";
    }
}
