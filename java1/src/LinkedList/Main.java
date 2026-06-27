package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertLast(99);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteFirst());
        list.insert(8,2);

        System.out.println(list.deleteLast());
        list.display();
    }
}
