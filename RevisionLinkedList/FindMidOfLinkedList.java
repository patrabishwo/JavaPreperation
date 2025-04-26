package RevisionLinkedList;

public class FindMidOfLinkedList {
    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null ){
              slow = slow.next;
              fast = fast.next.next;

        }

        return slow;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("the mid  of the  linked list is "+mid(head).data);
    }
}
