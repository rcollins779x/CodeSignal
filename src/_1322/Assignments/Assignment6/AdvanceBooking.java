//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment6;

class AdvanceBooking extends Ticket{
    private final int ticketNumber, days;
    private int price;

    AdvanceBooking() {
        ticketNumber = getTicketNumber();
        days = 0;
    }

    AdvanceBooking(int days) {
        ticketNumber = getTicketNumber();
        this.days = days;
        setPrice();
    }

    @Override
    void setPrice() {
        if (days < 15) price = 50; else price = 25;
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket # " + ticketNumber + " with a price of $" + getPrice() +
                " for a game in " + days + (days==1 ? " day." : " days.");
    }
}
