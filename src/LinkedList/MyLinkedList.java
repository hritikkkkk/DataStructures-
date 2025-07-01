package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public MyLinkedList() {
        head = null;
    }

    // Get value at specific index
    public int get(int index) {
        Node temp = head;
        while (temp != null && index > 0) {
            temp = temp.next;
            index--;
        }
        return temp != null ? temp.val : -1;
    }

    // Add node at head
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    // Add node at tail
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
    }

    // Add at a specific index
    public void addAtIndex(int idx, int val) {
        Node node = new Node(val);
        if (idx == 0) {
            node.next = head;
            head = node;
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1 && temp != null; i++) temp = temp.next;
        if (temp == null) return;
        node.next = temp.next;
        temp.next = node;
    }

    // Delete at index
    public void deleteAtIndex(int idx) {
        if (head == null) return;
        if (idx == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1 && temp != null; i++) temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    // Reverse entire linked list
    public Node reverseLL(Node head) {
        Node curr = head, prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // new head
    }

    // Reverse between two values
    public Node reverseLinkedList(Node head, int left, int right) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node temp = dummy;

        // Locate node before left
        while (temp.next != null && temp.next.val != left) {
            temp = temp.next;
        }

        Node prevLeft = temp;
        Node curr = temp.next;
        Node reverseTail = curr;
        Node prev = null, next;

        while (curr != null && curr.val != right) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if (curr == null) return dummy.next;

        next = curr.next;
        curr.next = prev;

        prevLeft.next = curr;
        reverseTail.next = next;

        return dummy.next;
    }

    // Remove nth node from end
    public void removeNthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int index = size - n;
        Node curr = head;
        if (index == 0) {
            this.head = head.next;
            return;
        }

        while (curr != null && index > 1) {
            curr = curr.next;
            index--;
        }

        if (curr != null && curr.next != null)
            curr.next = curr.next.next;
    }

    // Remove elements with specific value
    public Node removeElements(Node head, int value) {
        Node temp = head, prev = null;
        while (temp != null) {
            if (temp.val == value) {
                while (temp != null && temp.val == value) {
                    temp = temp.next;
                }
                if (prev != null) {
                    prev.next = temp;
                } else {
                    head = temp;
                }
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }

    // Find middle node
    public Node mid(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Check if linked list is palindrome (reference check only)
    public boolean isPalindrome(Node head) {
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.val != stack.pop().val) return false;
            temp = temp.next;
        }
        return true;
    }

    // Detect intersection point by value (Meetup Point)
    public Node MeetupPoint(Node h1, Node h2) {
        int s1 = 0, s2 = 0;
        Node t1 = h1, t2 = h2;
        while (t1 != null) {
            t1 = t1.next;
            s1++;
        }
        while (t2 != null) {
            t2 = t2.next;
            s2++;
        }

        Node fast = h1, slow = h2;
        if (s1 > s2) {
            int diff = s1 - s2;
            for (int i = 0; i < diff; i++) fast = fast.next;
        } else {
            int diff = s2 - s1;
            for (int i = 0; i < diff; i++) slow = slow.next;
        }

        while (fast != null && slow != null) {
            if (fast.val == slow.val) return slow;
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }

    // Cycle detection (Floyd’s algorithm)
    public boolean hasCycle(Node head) {
        if (head == null) return false;
        Node slow = head, fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    // Print linked list
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // === Main Function to test functionality ===
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        // Adding elements
        ll.addAtTail(5);
        ll.addAtTail(3);
        ll.addAtTail(1);
        ll.addAtTail(2);

        ll.addAtTail(5);
        ll.addAtTail(1);
        ll.addAtTail(2);


        Node prev = null, temp = ll.head;

        List<Integer> list = new ArrayList<>();
        int idx = 1;

        while (temp != null && temp.next != null) {

            if (prev != null) {
                int p = prev.val;
                int n = temp.next.val;
                int curr = temp.val;
                if ((curr > p && curr > n) || (curr < p && curr < n)) {
                    list.add(idx);
                }

            }
            prev = temp;
            idx++;

            temp = temp.next;

        }

        System.out.println(list);


//
//        System.out.println("Original List:");
//        ll.printLL();
//
//
//
//        // Reversing and printing again
//        ll.head = ll.reverseLL(ll.head);
//
//        System.out.println("Reversed List:");
//        ll.printLL();
//
//        // Palindrome check
//        System.out.println("Is Palindrome: " + ll.isPalindrome(ll.head));
//
//        // Mid Node
//        System.out.println("Middle Node: " + ll.mid(ll.head).val);

    }
}

