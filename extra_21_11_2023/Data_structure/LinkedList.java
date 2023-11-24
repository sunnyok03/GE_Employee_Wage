package com.extra_21_11_2023.Data_structure;

import java.util.Scanner;

public class LinkedList {
    private Node head;

    //traversing the list
    public void traverse() {
        Node curr = this.head;
        System.out.print("List is: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // insert at start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    // insertion at kth pos
    public void insertAtPosition(int data, int k) {
        Node newNode = new Node(data);

        if (k == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr= head;
        while(curr!= null && k > 1){
            curr = curr.next;
            k--;
        }

        if (curr == null) {
            System.out.println("Exceeding list length.");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    // insertion at last
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // deletion of start node
    public void deleteAtStart() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    // deletion at kth
    public void deleteAtPosition(int k) {
        if (k < 0 || head == null) {
            return;
        }

        if (k == 0) {
            head = head.next;
            return;
        }

        Node curr = head;
        Node prev = null;

        for (int i = 0; i < k && curr != null; i++) {
            prev = curr;
            curr= curr.next;
        }

        if (curr == null) {
            System.out.println("Exceeding list length.");
            return;
        }
        prev.next = curr.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList(); // creating the list object

        while(true){
            System.out.println("Press 1 to insert at start.");
            System.out.println("Press 2 to insert at kth position.");
            System.out.println("Press 3 to insert at end.");
            System.out.println("Press 4 to delete first node.");
            System.out.println("Press 5 to delete at kth position.");
            System.out.println("Press 6 to print the list.");
            System.out.println("Press 7 to end the program.");

            System.out.print("Enter your choice: ");
            int ch = scanner.nextInt();
            int num;
            int k;
            switch (ch) {
                case 1:
                    System.out.print("Enter num: ");
                    num = scanner.nextInt();
                    linkedList.insertAtStart(num);
                    break;

                case 2:
                    System.out.print("Enter num: ");
                    num = scanner.nextInt();
                    System.out.print("Enter k: ");
                    k = scanner.nextInt();
                    linkedList.insertAtPosition(num, k);
                    break;

                case 3:
                    System.out.print("Enter num: ");
                    num = scanner.nextInt();
                    linkedList.insertAtEnd(num);
                    break;

                case 4:
                    linkedList.deleteAtStart();
                    break;

                case 5:
                    System.out.print("Enter k: ");
                    k = scanner.nextInt();
                    linkedList.deleteAtPosition(k);
                    break;

                case 6:
                    linkedList.traverse();
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid.");
            }
        }
    }
}