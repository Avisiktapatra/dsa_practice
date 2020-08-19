package Bounce;

public class ItemBuilder {

    private final long id;
    private String name;
    private double unitCost;
    private int unitQuantity;

    public ItemBuilder(long id) {
        this.name = name;
        this.unitCost = unitCost;
        this.unitQuantity = unitQuantity;
        this.id = id;
    }

    public ItemBuilder setName(String name){
        this.name = name;
        return this;
    }

    public ItemBuilder setUnitCost(double amount){
        this.unitCost = amount;
        return this;
    }

    public ItemBuilder setUnitQuantity(int quantity){
        this.unitQuantity = quantity;
        return this;
    }

    public Item build(){
        return new Item(id, name, unitCost, unitQuantity);
    }
}
