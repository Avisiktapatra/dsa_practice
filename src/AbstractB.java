public class AbstractB extends AbstractA implements InterfaceA , Interfaceb{

    public void todo(int xy){
        System.out.println("yes" + xy);
    }

    public void print(){
        System.out.println("first");
    }
    public void printA(){
        System.out.println("first_");
    }


   public int add(int x,int y){
        return x+y;
   }
    public static void main(String[]  args){

AbstractA b = new AbstractB();
        InterfaceA a = new AbstractB();
        //System.out.println(b.add(a.x,8));
        System.out.println(a.add(2,8));
b.todo(b.xy);
    }

}
