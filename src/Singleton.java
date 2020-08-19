 class Singleton {

    private  Singleton(){

    }

    private static Singleton myObj;

    public static Singleton getInstance()
    {
        if(myObj == null){
            synchronized (Singleton.class){
                if(myObj == null){
                    myObj = new Singleton();
                }
            }
        }
        return myObj;
    }

     public static void main(String[] args) {
         Singleton s = getInstance();
     }
}




class Date{
    String year, month, day;


}

//setter