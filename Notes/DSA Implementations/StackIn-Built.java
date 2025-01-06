import java.util.Stack;

/**
push(): Adds an element to the top of the stack.
pop(): Removes and returns the top element.
peek(): Returns the top element without removing it.
Built-in synchronized, but less preferred for large-scale multithreading due to overhead.
*/



public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Pop an element
        System.out.println("Popped: " + stack.pop()); // Output: 30
        
        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Output: 20
        
        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        
        // Size of the stack
        System.out.println("Size: " + stack.size()); // Output: 2
    }
}
