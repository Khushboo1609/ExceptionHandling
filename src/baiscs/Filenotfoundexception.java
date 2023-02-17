package baiscs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Filenotfoundexception {
     public static void main(String[] args) throws FileNotFoundException {
         FileInputStream fs= new FileInputStream("C:\\Users\\bkhus\\Downloads\\multi.txt");
         System.out.println("file input stream created");

     }
}
