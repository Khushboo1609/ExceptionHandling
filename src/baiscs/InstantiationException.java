package baiscs;
class E{
    static{
        System.out.println("E class loading");
    }
    public E(){
        System.out.println("E object is created");
    }
}
 class InstantiationException {
     public static void main(String[] args)  throws Exception{  //if zero argument constructor for E class is unavailale
                                                              //then jvm will raise an exception
         Class c=Class.forName("baiscs.E");
         Object obj=c.newInstance();

     }
}
