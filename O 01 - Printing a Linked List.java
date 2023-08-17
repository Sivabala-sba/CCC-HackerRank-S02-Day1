import java.io.*;
import java.util.*;

class Node {
    int val;
    Node next;
}

public class Solution {

    void Print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of nodes in the linked list

        Node head = null;
        Node current = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            Node newNode = new Node();
            newNode.val = val;
            newNode.next = null;

            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }

        Solution solution = new Solution();
        solution.Print(head);

        scanner.close();
    }
}
