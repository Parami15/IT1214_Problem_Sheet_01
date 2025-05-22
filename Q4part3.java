public class Main4 {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        system.bookTicket(1, "John", 1);
        system.bookTicket(2, "Alice", 2);
        system.bookTicket(3, "Bob", 3);

        system.cancelTicket(2); // cancel Alice's booking

        system.bookTicket(4, "David", 2); // seat 2 is now free

        system.displayTickets();
    }
}
