package baiscs;
public class UnboundException {

    public static void main(String[] args) {
        int arr[] = new int [5];
        try{

        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("Hi HI HI HI");
        }
        finally {
            System.out.println("Hi, I am Final");
        }
    }



}
