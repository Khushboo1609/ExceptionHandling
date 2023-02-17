package baiscs;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Emp implements Serializable{
    int eno;
    String ename;
    float esal;
    String eddr;

    public Emp(int eno, String ename, float esal, String eddr) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
        this.eddr = eddr;
    }
  public void gatEmpDetails()
  {
      System.out.println("Employee Details");
      System.out.println("------------------");
      System.out.println("Employee number" + eno);
      System.out.println("Employee name" + ename);
      System.out.println("Emp salary:"+esal);
      System.out.println("emp addr"+eddr);
  }




}
class Serial   {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new  FileOutputStream("C:\\Users\\bkhus\\Downloads\\emp.txt");
                ObjectOutputStream o=new ObjectOutputStream(fos);
           Emp emp1=new Emp(111,"aaaa",50000000,"kormangla");
           emp1.gatEmpDetails();
           o.writeObject(emp1);
    }
}
