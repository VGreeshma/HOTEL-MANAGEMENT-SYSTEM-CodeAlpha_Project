import java.util.*;

public class Hotel {
    List<Room> rooms = new ArrayList<>();
    List<String> bookingHistory = new ArrayList<>();

    public Hotel() {
        for (int i = 0; i < 3; i++) rooms.add(new Room("Standard"));
        for (int i = 0; i < 2; i++) rooms.add(new Room("Deluxe"));
        for (int i = 0; i < 1; i++) rooms.add(new Room("Suite"));
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("- " + room.type);
            }
        }
    }

    public void bookRoom(String customerName, String roomType) {
        for (Room room : rooms) {
            if (room.type.equalsIgnoreCase(roomType) && room.isAvailable()) {
                room.book(customerName);
                bookingHistory.add(customerName + " booked a " + roomType + " room.");
                System.out.println("Room booked successfully for " + customerName);
                return;
            }
        }
        System.out.println("No " + roomType + " rooms available.");
    }

    public void cancelBooking(String customerName) {
        for (Room room : rooms) {
            if (room.customerName.equalsIgnoreCase(customerName)) {
                room.cancel();
                bookingHistory.add(customerName + "'s booking has been canceled.");
                System.out.println("Booking canceled for " + customerName);
                return;
            }
        }
        System.out.println("No booking found for " + customerName);
    }

    public void viewBookings() {
        System.out.println("Current Bookings:");
        for (Room room : rooms) {
            if (!room.isAvailable()) {
                System.out.println(room);
            }
        }
    }
}
