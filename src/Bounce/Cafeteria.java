package Bounce;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {

private List<Restaurant> restaurantList;
private List<String> menu;
private String name;
private String address;
private static String country = "India";

    public Cafeteria( String name, String address) {
        restaurantList = new ArrayList<>();
        this.name = name;
        this.address = address;
        menu = new ArrayList<>();
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurants) {
        for(Restaurant restaurant : restaurants){
            this.restaurantList.add(restaurant);
        }
    }

    public List<String> getMenu() { return menu; }

    public void setMenu(List<String> menu) { this.menu = menu; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Cafeteria.country = country;
    }
}
