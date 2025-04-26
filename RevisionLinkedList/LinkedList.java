package RevisionLinkedList;

public class LinkedList {
    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    public  static Node head;
    public  static Node tail;
    public static  int size;

    /*
    add: addFirst
      addLast
     */

    //addFirst
    public static void addFirst(int data){
        //creating  a new Node
        Node newNode = new Node(data);
        size++;
        if( head == null){
            head = tail = newNode;
            return;
        }
        // pointing the  newNode towards  the  head
        newNode.next = head;
        head = newNode;
    }

    //addLast
     public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
     }

     //removeFirst
    public int removeFirst(){
        if(size == 0){
            System.out.println("The LinkedList is empty");
            return Integer.MIN_VALUE;//-infinity
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //removeLast
    public static  int removeLast(){
        if(size == 0){
            System.out.println("The LinkedList is empty");
            return Integer.MIN_VALUE;//-infinity
        } else if (size == 1) {
            int val =  head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i=0; i< size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        size--;
        return val;
    }

    //iterativeSearch
    public int itSearch( int key){
         Node temp = head;
         int i=0;
         while(temp != null){
             if(temp.data == key){
                 return i;
             }
             temp = temp.next;
             i++;
         }
         return  -1;
    }


     // printing the  LinkedList
    public void print(){
        Node temp = head;
        while( temp !=  null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.print();

        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        System.out.println("The  size  of the LinkedList is "+ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println( ll.itSearch(4));

    }
}
