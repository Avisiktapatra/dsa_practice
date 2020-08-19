package ParkingLot;

public abstract class Vehicle {
    private String regNo;
    private String brand;
    private String color;
    private VehicleType tyoe;
    private Ticket assignTicket;

    public Vehicle(String regNo, String brand, String color, VehicleType tyoe) {
        this.regNo = regNo;
        this.brand = brand;
        this.color = color;
        this.tyoe = tyoe;

    }

    /*public abstract String getRegNo();
    public abstract String getBrand();
    public abstract String getColor();
    public abstract VehicleType getTyoe();*/

    public void assignTicket(Ticket ticket){
        this.assignTicket = ticket;
    }
}
