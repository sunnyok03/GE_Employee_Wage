package com.extra_21_11_2023.Data_structure;

import java.util.Scanner;

public class Stack {

    private Node head;

    // insertion
    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //deletion
    public void pop() {
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
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

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
                    stack.push(num);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    System.out.println(stack.isEmpty());

                case 4:
                    System.out.println(stack.peek());
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