package Linkedlist.Doublly_LinkedList;

public class Dlist {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(50);
        list.insertBTW(30, 3);
        list.display();

    }
}
