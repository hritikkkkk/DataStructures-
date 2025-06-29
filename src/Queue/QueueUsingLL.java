package Queue;


public class QueueUsingLL {


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }


    }

    private Node head;
    private Node tail;


    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        queue.display();


    }

    private int dequeue() {
        if (this.head == null) {
            System.out.println("queue is already empty");
            return -1;
        }
        int remove = this.head.data;

        this.head = this.head.next;
        return remove;
    }

    private void enqueue(int data) {
        Node nn = new Node(data);

        if (this.tail == null) {
            this.head = this.tail = nn;
            return;
        }

        this.tail.next = nn;

        this.tail = nn;
    }

    private int peek() {
        return head.data;
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void display() {
        System.out.println("----------------");
        Node temp = this.head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.println("----------------");
    }


}