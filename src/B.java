public class B extends A {
    static int y =8;
    int no=20;
    @Override
    public void print(){
        System.out.println("in class b-");
    }

    public static int getVal(int x){
        return x+2;
    }
    public int getVal1(int z){
        return z+y;
    }

    public static void printthis(){
        System.out.println("class b-static");
    }


    public void findSum(int x){
        System.out.println("sum is "+(x+1));
    }
    public static void main(String[] args){
        B b = new B();
        A a = new A();
        A ab = new B();
        System.out.println(b.no);
        b.print();
        a.print();
        ab.print();
        System.out.println(getVal(6));

        System.out.println(b.getVal1(12));
        b.printthis();
        a.printthis();
        ab.printthis();
      //  B ba = new A();

    }
}
