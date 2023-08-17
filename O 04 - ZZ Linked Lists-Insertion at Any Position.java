import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
}

public class Solution {

    static Node insertAtPosition(Node head, int pos, int val) {
        Node newNode = new Node();
        newNode.data = val;

        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

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
            int pos = scanner.nextInt();
            int val = scanner.nextInt();
            head = insertAtPosition(head, pos, val);
        }

        printLinkedList(head);

        scanner.close();
    }
}
