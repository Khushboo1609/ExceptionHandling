package baiscs;

class Classcast {




}
class B extends Classcast{




}
class T {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B();
        Classcast a = b;
        Classcast a1 = new Classcast();
        try {
            b1 = (B) a1;
            System.out.println("object created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
