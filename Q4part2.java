public class BookingSystem {
    private Ticket[] tickets = new Ticket[10]; // 10 seats
    private int count = 0;

    public boolean isSeatTaken(int seatNumber) {
        for (int i = 0; i < count; i++) {
            if (tickets[i].getSeatNumber() == seatNumber) {
                return true;
            }
        }
        return false;
    }

    public void bookTicket(int ticketNumber, String customerName, int seatNumber) {
        if (count >= tickets.length) {
            System.out.println("All seats are booked.");
            return;
        }
        if (isSeatTaken(seatNumber)) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return;
        }
        tickets[count++] = new Ticket(ticketNumber, customerName, seatNumber);
        System.out.println("Ticket booked for " + customerName + " at seat " + seatNumber);
    }

    public void cancelTicket(int ticketNumber) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (tickets[i].getTicketNumber() == ticketNumber) {
                // Shift tickets to fill gap
                for (int j = i; j < count - 1; j++) {
                    tickets[j] = tickets[j + 1];
                }
                tickets[--count] = null;
                found = true;
                System.out.println("Ticket #" + ticketNumber + " cancelled.");
                break;
            }
        }
        if (!found) {
            System.out.println("Ticket not found.");
        }
    }

    public void displayTickets() {
        for (int i = 0; i < count; i++) {
            System.out.println(tickets[i]);
        }
    }
}
