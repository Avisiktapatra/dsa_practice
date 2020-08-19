package Bounce;

import java.util.Objects;

public class Item {

    private final long id;
    private String name;
    private double unitCost;
    private int unitQuantity;

    private Item(long id) {
        this.id = id;
    }

    public Item(long id, String name, double unitCost, int unitQuantity) {
        this.name = name;
        this.unitCost = unitCost;
        this.unitQuantity = unitQuantity;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public int getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(int unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.unitCost, unitCost) == 0 &&
                name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unitCost);
    }
}
