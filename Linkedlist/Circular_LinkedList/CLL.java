package Linkedlist.Circular_LinkedList;

public class CLL {
    Node head;
    Node tail;
    int size;

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head for circular linkage
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail to point to the new head
        }
        size++;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head for circular linkage
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Update tail to point to the head
        }
        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node display = head;
        do {
            System.out.print(display.data + " -> ");
            display = display.next;
        } while (display != head);
        System.out.println("(back to head)");
    }

    public void insertBTW(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index >= size) {
            System.out.println("Index out of bounds. Size of LinkedList = " + size);
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    private class Node {
        Node next;
        int data;

        public Node(int val) {
            this.data = val;
        }
    }
}
