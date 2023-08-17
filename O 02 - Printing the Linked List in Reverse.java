import java.io.*;
import java.util.*;

class LinkedListNode {
    int data;
    LinkedListNode next;
}

public class Solution {

    static void ReversePrint(LinkedListNode head) {
        if (head == null) {
            return; // If the list is empty, don't print anything
        }

        LinkedListNode current = head;
        LinkedListNode prev = null;
        LinkedListNode nextNode;

        // Reverse the linked list while traversing it
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Print the reversed elements separated by space
        current = prev;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of nodes in the linked list

        LinkedListNode head = null;
        LinkedListNode current = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            LinkedListNode newNode = new LinkedListNode();
            newNode.data = val;
            newNode.next = null;

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }

        ReversePrint(head);

        scanner.close();
    }
}
