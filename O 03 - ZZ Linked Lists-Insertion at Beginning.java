import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
}

public class Solution {

    static Node insertAtBeginning(Node head, int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        return newNode;
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
            head = insertAtBeginning(head, val);
        }

        printLinkedList(head);

        scanner.close();
    }
}
