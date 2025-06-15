import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        int choice;

        System.out.println("Welcome to the Hotel Reservation System!");

        do {
            System.out.println("\n1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. View Bookings");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> hotel.displayAvailableRooms();
                case 2 -> {
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter room type (Standard/Deluxe/Suite): ");
                    String type = scanner.nextLine();
                    hotel.bookRoom(name, type);
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.print("Enter customer name to cancel: ");
                    String cancelName = scanner.nextLine();
                    hotel.cancelBooking(cancelName);
                }
                case 4 -> hotel.viewBookings();
                case 0 -> System.out.println("Thank you for using the system!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        scanner.close();
    }
}
