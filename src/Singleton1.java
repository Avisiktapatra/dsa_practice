import java.util.ArrayList;

public class Singleton1 {
    ArrayList<Singleton> list = new ArrayList<>();

    private Singleton1(){

    }

    private static Singleton1 object;

    public static Singleton1 getInstance(){
        if(object == null){
            object = new Singleton1();
        }
        return object;
    }

    public static void main(String[] args) {
        Singleton1 sigletonx = Singleton1.getInstance();
        sigletonx = null;
        //list.add(sigletonx);
    }
}
