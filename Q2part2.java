public class ParkingLot {
    private Vehicle[] vehicles = new Vehicle[5];
    private int count = 0;

    public void parkVehicle(Vehicle vehicle) {
        if (count < vehicles.length) {
            vehicles[count++] = vehicle;
        } else {
            System.out.println("Parking lot is full.");
        }
    }

    public void removeVehicle(String licensePlate) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getLicensePlate().equals(licensePlate)) {
                // Shift vehicles to avoid gap
                for (int j = i; j < count - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }
                vehicles[--count] = null;
                found = true;
                System.out.println("Vehicle " + licensePlate + " removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle not found.");
        }
    }

    public void displayVehicles() {
        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i]);
        }
    }
}
