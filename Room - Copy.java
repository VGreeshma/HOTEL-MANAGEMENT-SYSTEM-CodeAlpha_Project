public class Room {
    String type;
    boolean isBooked;
    String customerName;

    public Room(String type) {
        this.type = type;
        this.isBooked = false;
        this.customerName = "";
    }

    public boolean isAvailable() {
        return !isBooked;
    }

    public void book(String customerName) {
        this.isBooked = true;
        this.customerName = customerName;
    }

    public void cancel() {
        this.isBooked = false;
        this.customerName = "";
    }

    @Override
    public String toString() {
        return type + (isBooked ? " - Booked by " + customerName : " - Available");
    }
}
