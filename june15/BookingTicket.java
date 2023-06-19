package june15;

public class BookingTicket {
    public static void main(String[] args) {
        int availableTickets = 10; // Total number of available tickets
        TicketSystem bookingSystem = new TicketSystem(availableTickets);

        // Create multiple booking threads
        Thread thread1 = new Thread(new BookingThread(bookingSystem, 2, "Thread 1"));
        Thread thread2 = new Thread(new BookingThread(bookingSystem, 4, "Thread 2"));
        Thread thread3 = new Thread(new BookingThread(bookingSystem, 3, "Thread 3"));

        // Start the booking threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
