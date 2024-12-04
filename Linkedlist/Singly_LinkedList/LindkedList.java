package Linkedlist.Singly_LinkedList;

public class LindkedList {
    public static void main(String[] args) {
        LL list = new LL();

        list.add(10);
        list.add(50);
        list.pushback(100);
        list.add(30);
        list.add(20);
        list.insert(5050, 5);
        list.deletefrom(10);
        list.deleteFirst();
        list.display();
    }
}
