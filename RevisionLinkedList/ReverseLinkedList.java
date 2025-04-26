package RevisionLinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static  int size;

    public static  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void print(){
        Node temp = head;
        size++;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void  reverse(){
         Node prev = null;
         Node curr = head;
         Node next;

         while( curr != null){
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr= next;
         }
         head = prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("The linked list  before   Reverse");
        ll.print();

        System.out.println("The LinkedList after  reverse");
        ll.reverse();

        ll.print();




    }
}
