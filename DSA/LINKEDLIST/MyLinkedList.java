package DSA.LINKEDLIST;

public class MyLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size = 0;
    private Node tail;

    // add node at first
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            size++;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("\nList is empty!");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        temp = null;
    }

    public void removeLast() {
        if (head == null) {
            throw new RuntimeException("List is empty!");
        }
        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;

        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        temp = null;
        size--;
    }

    public void addAtPosition(int data, int pos) {
        System.out.println("POS: " + pos + " SIZE: " + size);
        if (pos < 0 || pos > size)
            throw new RuntimeException("Invalid position!!");
        if (pos == 0) {
            addFirst(data);
            return;
        }
        if (pos == size()) {
            addLast(data);
            return;
        }

        int count = 1;
        Node temp = head;
        while (temp != null) {
            if (count == pos) {
                break;
            }
            temp = temp.next;
            count++;
        }
        Node node = new Node(data);
        Node t = temp.next;
        node.next = t;
        temp.next = node;
        t = null;
        temp = null;
        size++;
    }

    public void removeAtPosition(int pos) {
        System.out.println("POS: " + pos + " SIZE: " + size);
        if (pos < 0 || pos >= size)
            throw new RuntimeException("Invalid position!!");
        if (pos == 0) {
            removeFirst();
            return;
        }
        if (pos == size()) {
            removeLast();
            return;
        }
        int count = 1;
        Node temp = head;
        while (temp != null) {
            if (count == pos) {
                break;
            }
            temp = temp.next;
            count++;
        }

        if (temp.next != null)
            temp.next = temp.next.next;

        temp = null;
        size--;
    }

    public int get(int n) {

        if (n < 0 || n >= size) {
            throw new RuntimeException("Enter valid position ..");
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == n) {
                return temp.data;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next == null)
                System.out.print(temp.data);
            else
                System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }

    public int size() {
        return size;
    }
}
