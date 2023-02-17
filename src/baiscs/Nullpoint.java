package baiscs;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Date;

class Nullpoint {
    public static void main(String[] args) {
        try {
            Date d = null;
            System.out.println(d.toString());
        }
       catch(Exception e)
        {

            e.printStackTrace();
            System.out.println(e.getMessage());


        }
        finally{
            System.out.println("crack");
        }
    }
}
