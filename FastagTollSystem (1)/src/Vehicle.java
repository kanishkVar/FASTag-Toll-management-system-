// Author: Kanishk Varshney
// Project: FASTag Toll System - GUVI Hackathon
// Year: 2025

package MyModel;

public class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private int balance;

    public Vehicle(String vehicleNumber, String ownerName, int balance) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getOwnerName() { return ownerName; }
    public int getBalance() { return balance; }

    public void setBalance(int balance) { this.balance = balance; }
}
