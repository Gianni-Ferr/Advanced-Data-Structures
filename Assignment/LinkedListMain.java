/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package node;

/**
 *
 * @author Hp
 */
public class LinkedListMain {
    public static void main(String args[]){
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(1);
         linkedList.addFirst(8);
          linkedList.addFirst(5);
           linkedList.addFirst(3);
            linkedList.addLast(6);
           System.out.println("LinkedList");
            
            Node node = new  Node();
            node.data=1;
            
            Node node2 = new Node();
            node2.data=5;
            linkedList.removeFirst();
            linkedList.printLinkedList();
    
}
}
