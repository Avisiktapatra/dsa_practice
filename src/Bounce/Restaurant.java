package Bounce;

import java.util.*;

public class Restaurant {

    private String name;
    private static int count;
    private List<Item> itemList;
    private PriorityQueue<Order> processingQueue;
    private int uuid;
    private int processingPower;
    private Map<Item, Double> itemPrice;

    public Restaurant(String name, int uuid, int processingPower) {
        this.name = name;
        itemList = new ArrayList<>();
        processingQueue = new PriorityQueue<>((a,b) -> a.getChosenRestro().getProcessingPower() - b.getChosenRestro().getProcessingPower());
        this.uuid = uuid;
        this.processingPower = processingPower;
        itemPrice = new HashMap<>();
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Restaurant.count = count;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
       for(Item item: itemList){
           this.itemList.add(item);
       }
    }

    public PriorityQueue<Order> getProcessingQueue() {
        return processingQueue;
    }

    public void setProcessingQueue(PriorityQueue<Order> processingQueue) {
        this.processingQueue = processingQueue;
    }

    public int getUuid() {
        return uuid;
    }

    public int getProcessingPower() {
        return processingPower;
    }

    public void setProcessingPower(int processingPower) {
        this.processingPower = processingPower;
    }

    public Map<Item, Double> getItemPrice() {
        return this.itemPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemPrice(List<Item> itemList) {
        for(Item item : itemList){
            if(!itemPrice.containsKey(item))
                itemPrice.put(item, item.getUnitCost());
        }
    }

}
