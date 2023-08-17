import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
}

public class Solution {

    static Node insertAtEnd(Node head, int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        return head;
    }

    static Node deleteAtPosition(Node head, int pos) {
        if (head == null || pos == 0) {
            return head != null ? head.next : null;
        }

        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return head; // No valid position found
        }

        current.next = current.next.next;

        return head;
    }

    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of elements

        Node head = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            head = insertAtEnd(head, val);
        }

        int k = scanner.nextInt(); // k value for deletion

        head = deleteAtPosition(head, k);

        printLinkedList(head);

        scanner.close();
    }
}
