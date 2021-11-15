package LinkedList;

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    static  Node insert(Node head,int data) {
        if(head == null) return new Node(data);
        Node start = head;

        while(start.next != null) start = start.next;

        start.next = new Node(data);
        return head;
    }

    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int[] array = {1,2,2,3,3,4};
        System.out.print("size: ");
        int N = array.length;//sc.nextInt();
        System.out.println("N: " + N);
        for (int j : array) {
            //System.out.print(N + " Element: ");
            //int ele = sc.nextInt();
            head = insert(head, j);
            System.out.println("data: " + j);
        }

        display(removeDuplicates(head));
        sc.close();
    }

    private static Node removeDuplicates(Node head) {
        if(head == null) return null;
        for(Node cur = head; cur.next != null;)
            if (cur.data == cur.next.data) cur.next = cur.next.next;
            else cur = cur.next;
            return head;
    }

    static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
        System.out.println();
    }

}
