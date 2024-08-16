package Linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void pushback(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            add(data);
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
            newNode.next = null;
            size++;
        }
    }

    public void insert(int val, int index) {
        Node newNode = new Node(val);
        if (index == 0) {
            add(val);
            return;
        }
        if (index > size) {
            pushback(val);
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void delete() {
        if (head == null) {
            return;
        }
        if (tail == head) {
            head = null;
        } else {
            // delete a node of linkedlist
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }

    public void deletefrom(int index) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;

        }
        if (index > size) {
            delete();
            return;
        } else {
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
        } else {
            head = head.next;
            size--;
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

}
