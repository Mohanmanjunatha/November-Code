package org.example;
class LinkedList {
    // Node class representing each element in the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head;

    // Method to add a new node to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (head == null) {  // If the list is empty, make this node the head
            head = newNode;
        } else {
            Node current = head;
            // Traverse to the last node
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;  // Set the last node's next to the new node
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {  // If the list is empty
            System.out.println("The linked list is empty.");
            return;
        }
        Node current = head;
        // Traverse through the list
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");  // End of the linked list
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding nodes to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Displaying the linked list
        list.display();  // Output should be: 10 -> 20 -> 30 -> 40 -> null
    }
}
