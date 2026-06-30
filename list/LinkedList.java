import java.util.*;

public class LinkedList {
    static Node head = null;

    // Insert at Beginning
    static void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    static void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at Position (1-based)
    static void insertPosition(int pos, int data) {
        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 1) {
            insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete First
    static void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    // Delete Last
    static void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at Position (1-based)
    static void deletePosition(int pos) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (pos <= 0) {
            System.out.println("Invalid Position");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }
        temp.next = temp.next.next;
    }

    // Display
    static void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Insert Operations");
        insertFirst(20);
        insertFirst(10);
        insertLast(30);
        insertPosition(3, 25);

        display();

        System.out.println("\nDelete First");
        deleteFirst();
        display();

        System.out.println("\nDelete Last");
        deleteLast();
        display();

        System.out.println("\nDelete Position");
        deletePosition(2);
        display();
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}