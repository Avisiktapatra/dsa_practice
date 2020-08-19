package Game;

public class Pipe {
    public int startingPoint; //head
    public int endPoint; //tail

    public Pipe(int startingPoint, int endPoint) {
        this.startingPoint = startingPoint;
        this.endPoint = endPoint;
    }

    public int getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(int startingPoint) {
        this.startingPoint = startingPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }
}
