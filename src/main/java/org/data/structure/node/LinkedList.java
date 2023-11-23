package org.data.structure.node;

public class LinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node n1 = new Node(data); // 10 20
        n1.next = head;
        head = n1;
    }
    public void insertAtPosition(int index, int data) {
        Node n1 = new Node(data);
        Node temp = head;
        if(index==0){
            insertAtBeginning(data);
            return;
        }
        for (int i = 0; i < index - 1; i++)temp = temp.next;
        n1.next = temp.next;
        temp.next = n1;
    }

    public void inertAtEnding(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n1;
        }
    }

    public void deleteAtBeginning() {
        head = head.next;
    }

    public void deleteAtEnding() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int index) {
        if (index == 0) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public int get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp == null ? -1 : temp.data;

    }
    public void printLinkList() {
        Node temp = head;
        if (head == null){
            System.out.println("LinkedLink is empty...!!");
            return;
        }
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
}
