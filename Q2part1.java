public class Vehicle {
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    public Vehicle(String licensePlate, String ownerName, int hoursParked) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }

    public String getLicensePlate() { return licensePlate; }
    public String getOwnerName() { return ownerName; }
    public int getHoursParked() { return hoursParked; }

    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setHoursParked(int hoursParked) { this.hoursParked = hoursParked; }

    public String toString() {
        return "License: " + licensePlate + ", Owner: " + ownerName + ", Hours: " + hoursParked;
    }
}
