package ParkingLot;

import java.util.Date;

public class Slots {
    private String slotNo;
    private String size;
    private boolean isFull;
    private Date entry;
    private Date exit;

    public Slots(String slotNo, String size, boolean isFull, Date entry, Date exit) {
        this.slotNo = slotNo;
        this.size = size;
        this.isFull = isFull;
        this.entry = entry;
        this.exit = exit;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public String getSize() {
        return size;
    }

    public boolean isFull() {
        return isFull;
    }

    public Date getEntry() {
        return entry;
    }

    public Date getExit() {
        return exit;
    }
}
