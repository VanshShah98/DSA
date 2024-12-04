package Linkedlist.Doublly_LinkedList;

public class DLL {
    Node head;
    Node tail;
    int size = 0;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        node.data = val;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node display = head;
        while (display != null) {
            System.out.print(display.data + "->");
            display = display.next;
        }
        System.out.println();
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) { // Single node in the list
            head = null;
            tail = null;
        } else {
            head = head.next; // Move head to the next node
            head.prev = tail; // Update the new head's `prev` to tail
            tail.next = head; // Update tail's `next` to new head
        }
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) { // Single node in the list
            head = null;
            tail = null;
        } else {
            tail = tail.prev; // Move tail to the previous node
            tail.next = head; // Update tail's `next` to head
            head.prev = tail; // Update head's `prev` to the new tail
        }
        size--;
    }

    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds.");
            return;
        }

        if (index == 0) { // Deleting the first node
            deleteFirst();
            return;
        }

        if (index == size - 1) { // Deleting the last node
            deleteLast();
            return;
        }

        // Deleting a node at the middle
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next; // Traverse to the node at the given index
        }

        current.prev.next = current.next; // Link the previous node to the next node
        current.next.prev = current.prev; // Link the next node to the previous node
        size--;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        newNode.data = val;
        newNode.next = null;
        newNode.prev = tail;

        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }

        tail = newNode;
        size++;
    }

    public void insertBTW(int val, int index) {
        Node newNode = new Node(val);
        newNode.data = val;
        if (head == null) {
            insert(val);
            return;
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index > size) {
            System.out.println("Size of LinkedList = " + size);
            return;
        }
        Node curr = head;
        for (int i = 1; i < index - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next = newNode;
    }

    private class Node {
        Node next;
        Node prev;
        int data;

        public Node(int val) {
            this.data = val;
        }

        public Node(Node next, Node prev, int data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }
    }

}
