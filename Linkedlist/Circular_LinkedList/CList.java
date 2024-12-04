package Linkedlist.Circular_LinkedList;

public class CList {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(40);
        list.insertFirst(50);
        list.insertBTW(30, 0);
        list.display();

    }
}
