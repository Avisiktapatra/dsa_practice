package Bounce;

import java.util.HashMap;
import java.util.Map;

public class RestaurantBuilder {

    private String name;
    private final int uuid;
    private int processingPower;
    private Map<Item, Integer> itemPrice;

    public RestaurantBuilder(int uuid) {
        this.name = name;
        this.uuid = uuid;
        this.processingPower = processingPower;
        itemPrice = new HashMap<>();
    }

    public RestaurantBuilder setName(String name){
        this.name = name;
        return this;
    }

    public RestaurantBuilder setProcessingPower(int number){
        this.processingPower = number;
        return this;
    }

    public Restaurant build(){
        return new Restaurant( name, uuid, processingPower);
    }

}
