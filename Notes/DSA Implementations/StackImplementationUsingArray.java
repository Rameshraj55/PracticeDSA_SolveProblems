// Stack implementation using an array
/**
Methods:
push(value): Adds an element to the stack. It checks if the stack is full before pushing the element.
pop(): Removes and returns the element from the top of the stack. It checks if the stack is empty before popping.
peek(): Returns the top element of the stack without removing it.
isEmpty(): Checks if the stack is empty by verifying if top is -1.
isFull(): Checks if the stack is full by verifying if top has reached maxSize - 1.
size(): Returns the current number of elements in the stack (top + 1).
display(): Displays the current elements in the stack from bottom to top.
*/



public class Stack {
    private int maxSize;
    private int top;
    private int[] stack;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;  // Indicates that the stack is empty
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stack[++top] = value;  // Increment top and then add the element
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a special value to indicate stack is empty
        } else {
            int poppedValue = stack[top--];  // Return the top value and decrement top
            return poppedValue;
        }
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Print the elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack contents: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create a stack of size 5
        Stack stack = new Stack(5);

        // Push some elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display stack elements
        stack.display();

        // Pop an element
        System.out.println("Popped value: " + stack.pop());

        // Display stack elements again
        stack.display();

        // Peek at the top element
        System.out.println("Top element is: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Check the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}
