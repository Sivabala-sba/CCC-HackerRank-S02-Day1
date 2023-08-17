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

    static Node deleteAtBeginning(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
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

        for (int i = 0; i < k; i++) {
            head = deleteAtBeginning(head);
        }

        printLinkedList(head);

        scanner.close();
    }
}
