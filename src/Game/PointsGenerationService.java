package Game;
import java.util.*;

public class PointsGenerationService { //dice has 6 faces

    public static int generatePoints(){
        Random random = new Random();
        int points = random.nextInt(6);
        return points;
    }
}
