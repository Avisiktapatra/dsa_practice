public class Oops1 {
    /*static{
        String str ="My world";
        System.out.print("initialize this ");
    }*/
   /* public int print(int i){
        System.out.print("int");
        return i;
    }*/
    public float print(float i){
        System.out.print("floa");
        return i;
    }
    public double print(double i){
        System.out.print("dou");
        return i;
    }
    public static void main(String [] args){
        Oops1 o1 =new Oops1();

        System.out.print(o1.print(10));
    }
}
