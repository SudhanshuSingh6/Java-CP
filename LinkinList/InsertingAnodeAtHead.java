package LinkinList;

import java.util.*;

public class InsertingAnodeAtHead {

    static class Node {

        public int data;
        public Node next;

        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {

        public Node head;
        public Node tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

    }

    public static void printSinglyLinkedList(Node node) {
        while (node != null) {
            System.out.print(node.data +" ");
            node = node.next;
        }
    }

    static Node insertNodeAtHead(Node llist, int data) {
        Node head = new Node(data);
        head.next = llist;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = sc.nextInt();
        for (int i = 0; i < llistCount; i++) {
            int llistItem = sc.nextInt();
            Node llist_head = insertNodeAtHead(llist.head, llistItem);
            llist.head = llist_head;
        }
        printSinglyLinkedList(llist.head);
        sc.close();
    }
}
