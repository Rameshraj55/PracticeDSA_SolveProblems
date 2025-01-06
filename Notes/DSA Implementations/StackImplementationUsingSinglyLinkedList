// Stack implementation using a singly linked list
/**
Node Class:
    A Node represents an element in the stack. Each node holds an integer value and a reference to the next node in the stack.

LinkedListStack Class:
    The stack is represented by the top pointer, which initially points to null, meaning the stack is empty.
    push(value): A new node is created and added to the top of the stack by adjusting the next pointers.
    pop(): The value at the top is removed by adjusting the top pointer to point to the next node.
    peek(): Returns the value of the node at the top without modifying the stack.
    isEmpty(): Checks if the stack is empty by checking if top is null.
    display(): Prints all elements in the stack starting from the top.
*/

class Node {
    int value;
    Node next;

    // Constructor to initialize the node
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top;

    // Constructor to initialize the stack
    public LinkedListStack() {
        top = null;  // Initially, the stack is empty
    }

    // Push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);  // Create a new node
        newNode.next = top;  // Make newNode point to the current top
        top = newNode;  // Move the top pointer to the new node
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Indicating that the stack is empty
        } else {
            int poppedValue = top.value;  // Get the top value
            top = top.next;  // Move the top pointer to the next node
            return poppedValue;
        }
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return top.value;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node current = top;
            System.out.print("Stack contents: ");
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

class MainLinkedList {
    public static void main(String[] args) {
        // Create a stack using linked list
        LinkedListStack stack = new LinkedListStack();

        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display the stack contents
        stack.display();

        // Pop an element
        System.out.println("Popped value: " + stack.pop());

        // Display stack contents again
        stack.display();

        // Peek at the top element
        System.out.println("Top element is: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
