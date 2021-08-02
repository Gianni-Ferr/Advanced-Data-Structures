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
public class SinglyLinkedList {
    private Node head;
    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    
    public void removeFirst(){
        head = head.next;
    }
    public void printLinkedList (){
        Node current = head;
        while (current !=null){
            current.displayNodeData();
            current = current.next;
        }
        System.out.print("NULL");
}
    public void addLast(int data) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        Node newNode = new Node();
        newNode.data=data;
        current.next= newNode;
    }
    
    public void addAll(){
       
        
    }
    
    public void clear(){
        head=null;
        
    }
    public void removeLast(){
        Node current = head;
        Node temp = head;
        while(current.next !=null){
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
    }
    public void addLast(Node after, int  data){
        Node current = head;
        Node temp = head;
        while (temp.data != after.data ) {
            temp = current;
            current = current.next;
            
        }
        Node newNode = new Node();
        newNode.data = data;
        temp.next = newNode;
        newNode.next = current;
        System.out.println("NULL");
    }
    }
