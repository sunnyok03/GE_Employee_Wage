package com.extra_21_11_2023.Data_structure;

import java.util.Scanner;

public class Queue {

    private Node head;

    // insertion
    public void enqueue(int data) {
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

    //deletion
    public void dequeue() {
        if (head == null) {
            System.out.println("Queue Empty.");
            return;
        }

        head = head.next;
    }


    // check if empty
    public boolean isEmpty() {
        return head == null;
    }

    // get top element
    public int peek() {
        if (head == null) {
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();

        while(true){
            System.out.println("Press 1 to insert");
            System.out.println("Press 2 to delete at top");
            System.out.println("Press 3 to check if empty");
            System.out.println("Press 4 to get top element");
            System.out.println("Press 5 to exit");

            System.out.print("Enter your choice: ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter num: ");
                    int num = scanner.nextInt();
                    queue.enqueue(num);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    System.out.println(queue.isEmpty());

                case 4:
                    System.out.println(queue.peek());
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid.");
            }
        }
    }
}