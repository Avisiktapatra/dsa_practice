package ParkingLot;

import java.util.*;

public class Levels {
    private int capacity;
    private int id;
    private int available;
    private List<Slots> slots;
    private boolean isFull;

    public Levels(int capacity, int id, int available, List<Slots> slots, boolean isFull) {
        this.capacity = capacity;
        this.id = id;
        this.available = available;
        this.slots = slots;
        this.isFull = isFull;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public List<Slots> getSlots() {
        return slots;
    }

    public void setSlots(List<Slots> slots) {
        this.slots = slots;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
