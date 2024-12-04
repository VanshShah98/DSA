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

    // public void delete(int index) {
    // if (head == null) {
    // return;
    // }
    // Node curr = head;
    // for (int i = 0; i < index - 1; i++) {
    // curr = curr.next;
    // }
    // if (curr.next.next == null) {
    // curr.next = null;
    // return;
    // }
    // curr.next = curr.next.next;
    // curr.next.next.prev = curr;
    // size--;
    // }

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
