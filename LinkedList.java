
public class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // implimentation  of insertion of a node at the end 

    public void insertAtEnd(int newData){
        node new Node(newData);

        // linkedlist is empty

        if(head == null){
            head = new (newData);
            return;
        }
    

        // linkedlist is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            
        }

        temp.next = newNode;
        return;
    }
    // implimentation of displaying the linkedlist
    public void displayLL(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
            
        }
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(newData:2);
        llist.insertAtEnd(newData:4);
        llist.insertAtEnd(newData:8);
        
        System.out.println("Before insertion of 10");
        llist.displayLL();
        System.out.println();

        llist.insertAtEnd(newData:10);
        System.out.println("After insertion of 10");
        llist.displayLL();
        System.out.println();
    }
}






