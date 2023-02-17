package baiscs;
class Employee{
    static{
        System.out.println("Employee class loading");
    }
}
class ClassnotfoundException {
    public static void main(String[] args) throws Exception {
        Class.forName("baiscs.Employee");//no error is coming class employee is available but if i try to load
        // some other class like emp class not found exception will come .
    }
}
