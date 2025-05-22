public class Ticket {
    private int ticketNumber;
    private String customerName;
    private int seatNumber;

    public Ticket(int ticketNumber, String customerName, int seatNumber) {
        this.ticketNumber = ticketNumber;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public int getTicketNumber() { return ticketNumber; }
    public String getCustomerName() { return customerName; }
    public int getSeatNumber() { return seatNumber; }

    public String toString() {
        return "Ticket #" + ticketNumber + ", Customer: " + customerName + ", Seat: " + seatNumber;
    }
}