package DSA.LINKEDLIST;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(5);
        list.addLast(50);
        list.display();
        System.out.println();
        // System.out.println("GET VALUE : : " + list.get(5));
        list.addAtPosition(15, 2);
        list.display();
        System.out.println();
        list.addAtPosition(60, 6);
        System.out.println();
        list.display();
        System.out.println();
        list.addAtPosition(0, 0);
        System.out.println();
        list.display();
        System.out.println();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        // list.removeLast();
        list.removeAtPosition(2);
        list.removeAtPosition(6);
        list.removeAtPosition(0);
        list.removeAtPosition(3);
        list.removeAtPosition(2);
        list.removeAtPosition(2);
        list.removeAtPosition(2);
        list.removeAtPosition(2);
        list.display();
        // list.addAtPosition(70, 8);
        // System.out.println();
        // list.display();
        // list.removeFirst();
        // list.removeFirst();
        // list.removeFirst();
        // list.removeFirst();
        // list.removeFirst();
        // // list.removeFirst();
        // System.out.println();
        // list.display();
        System.out.println("\nSIZE: " + list.size());
    }
}
