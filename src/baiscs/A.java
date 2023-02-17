package baiscs;

 class A {
     int m1(){
         try{
             return 10;
         }catch(Exception e){
             return 20;
         }finally{
             return 30;
         }
     }

}
 class T2{
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.m1());

    }
}
