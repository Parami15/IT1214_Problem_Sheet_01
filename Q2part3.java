public class Main2 {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        lot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        lot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        lot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

        lot.removeVehicle("XYZ789");

        lot.displayVehicles();
    }
}
