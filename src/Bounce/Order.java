package Bounce;

import java.util.Date;
import java.util.HashMap;

public class Order {

    private final int uuid;
    private double totalPrice;
    private String userName;
    private String deliveryAddress;
    private String orderStatus;
    private HashMap<String, Integer> items;
    private long orderTime;
    private Restaurant chosenRestro;

    public Order(int uuid, String userName, String deliveryAddress, String orderStatus, long orderTime) {
        this.uuid = uuid;
        this.userName = userName;
        this.deliveryAddress = deliveryAddress;
        this.orderStatus = orderStatus;
        this.orderTime = orderTime;
        items = new HashMap<>();
    }

    public int getUuid() {
        return uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(long orderTime) {
        this.orderTime = orderTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Restaurant getChosenRestro() {
        return chosenRestro;
    }

    public void setChosenRestro(Restaurant chosenRestro) {
        this.chosenRestro = chosenRestro;
    }
}
