package Game;

import java.util.*;

public class Board {

    public int size;
    public List<Snake> snakeList;
    public List<Pipe> pipeList;
    public HashMap<String, Integer> players; //userid + score

    public Board(int size) {
        this.size = size;
        this.snakeList = new ArrayList<>();
        this.pipeList = new ArrayList<>();
        this.players = new HashMap<>();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Snake> getSnakeList() {
        return snakeList;
    }

    public void setSnakeList(List<Snake> snakeList) {
        this.snakeList = snakeList;
    }

    public List<Pipe> getPipeList() {
        return pipeList;
    }

    public void setPipeList(List<Pipe> pipeList) {
        this.pipeList = pipeList;
    }

    public HashMap<String, Integer> getPlayers() {
        return players;
    }

    public void setPlayers(HashMap<String, Integer> players) {
        this.players = players;
    }
}
