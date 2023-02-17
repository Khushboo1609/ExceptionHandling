package baiscs;

 class ArthmeticException {
     public static void main(String[] args)
     {

         try{
             int data=6/0;
             System.out.println(data);
             for(int i=0;i<10;i++)
             {
                 System.out.println(i);
             }
         }
         catch(Exception e)
         {

         }
         finally{
             System.out.println("done");

         }
     }

}
