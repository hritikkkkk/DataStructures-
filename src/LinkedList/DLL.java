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

//        ll.head = ll.removeDuplicatesFromSortedDoublyLinkedList(ll.head);
        ll.removeDuplicate(ll.head);
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


    public Node removeDuplicatesFromSortedDoublyLinkedList(Node head) {
        Node temp = head, prev = null;
        while (temp != null) {
            if (temp.next != null && temp.val == temp.next.val) {
                int val = temp.val;
                while (temp != null && temp.val == val) {
                    temp = temp.next;
                }
                if (prev != null) {
                    prev.next = temp;
                } else {
                    head = temp;
                }
                if (temp != null) {
                    temp.prev = prev;
                }

            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    public void removeDuplicate(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                deleteNode(temp.next);
            } else {
                temp = temp.next;
            }
        }
    }

    public void deleteNode(Node del) {
//        if (del == null) {
//            return;
//        }
//
//        if (del.prev == null) {  //head of the linkedlist
//            del.next.prev = null;
//            del = del.next;
//        } else {
//            if (del.next != null) { //middle node
//                del.next.prev = del.prev;
//
//            }
//            del.prev.next = del.next;   // tail node
//
//
//        }

        if (del == null) return;

        if (del.prev != null) {
            del.prev.next = del.next;
        }
        if (del.next != null) {
            del.next.prev = del.prev;
        }
    }

    public void printLL() {
        System.out.println("Forward Traversal:");
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.printf("[%s <- %d -> %s]  ",
                    temp.prev != null ? temp.prev.val : "null",
                    temp.val,
                    temp.next != null ? temp.next.val : "null"
            );
            last = temp;
            temp = temp.next;
        }

        System.out.println("\nReverse Traversal:");
        while (last != null) {
            System.out.print(last.val + " <- ");
            last = last.prev;
        }
        System.out.println("null");
    }


}
