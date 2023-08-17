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

    static boolean searchElement(Node head, int val) {
        Node current = head;
        while (current != null) {
            if (current.data == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of elements

        Node head = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            head = insertAtEnd(head, val);
        }

        int searchVal = scanner.nextInt(); // Element to be searched

        if (searchElement(head, searchVal)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}
