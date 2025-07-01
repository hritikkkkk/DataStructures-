package LinkedList;

public class DLL {
    class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }

    Node head;

    public DLL() {
        head = null;
    }

    public static void main(String[] args) {
        DLL ll = new DLL();


        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(3);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(4);

        ll.printLL();


    }

    public void add(int val) {
        Node node = new Node(val);
        node.next = head;

        if (head != null)
            head.prev = node;
        head = node;

    }

    public void insertAtEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;


    }


    public void removeDuplicatesFromSortedDoublyLinkedList() {

    }

    public void printLL() {

        Node temp = head;
        Node last = null;


        while (temp != null) {
            System.out.print(temp.val);
            last = temp;
            temp = temp.next;
            if (temp != null) System.out.print(" <-> ");
        }
        System.out.println(" <-> null");


    }

}
