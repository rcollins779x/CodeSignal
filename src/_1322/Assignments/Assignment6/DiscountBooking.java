//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment6;

class DiscountBooking extends Ticket{
    private final int ticketNumber, days;
    private int price;

    DiscountBooking() {
        ticketNumber = getTicketNumber();
        days = 0;
    }

    DiscountBooking(int days) {
        ticketNumber = getTicketNumber();
        this.days = days;
        setPrice();
    }

    @Override
    void setPrice() {
        price = 10;
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
