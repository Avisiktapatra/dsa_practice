package ParkingLot;

public class Address {
    String city;
    String pincode;
    String streetAddress;

    public Address(String city, String pincode, String streetAddress) {
        this.city = city;
        this.pincode = pincode;
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getPincode() {
        return pincode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }
}
