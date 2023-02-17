package baiscs;

import com.sun.source.tree.TryTree;

class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = next;
    }
    }

 class LinkList {
     public static void main(String[] args) {

             Node n = new Node(1);
             Node n1 = new Node(2);
             n.next = n1;
             System.out.println(n.val + "->" + n1.val);


     }
 }
