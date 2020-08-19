package ParkingLot;

import java.util.HashMap;
import java.util.Set;

public class Building {
   private int id;
   private String name;
   private Set<Levels> levels;
   private boolean isFull;
   private HashMap<Levels, Integer> levelsMap;


    public Building(int id, String name, Set<Levels> levels, boolean isFull, HashMap<Levels, Integer> levelsMap) {
        this.id = id;
        this.name = name;
        this.levels = levels;
        this.isFull = isFull;
        this.levelsMap = levelsMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Levels> getLevels() {
        return levels;
    }

    public boolean isFull() {
        return isFull;
    }

    public HashMap<Levels, Integer> getLevelsMap() {
        return levelsMap;
    }
}
