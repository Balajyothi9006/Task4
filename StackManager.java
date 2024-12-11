
import java.util.*;

public class StackManager {
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public StackManager() {
        stack = new Stack<>();
    }

    // Method to push an element into the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    // Method to pop an element from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            int poppedElement = stack.pop();
            System.out.println("Popped: " + poppedElement);
        }
    }

    // Method to display all elements in the stack
    public void isStackEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }

    // Method to peek at the top element without removing it


    public static void main(String[] args) {
        StackManager stackManager = new StackManager();

        // Push elements
        stackManager.pushElement(1);
        stackManager.pushElement(2);
        stackManager.pushElement(3);
        stackManager.pushElement(4);
        stackManager.isStackEmpty();
        stackManager.popElement();
        stackManager.popElement();
        stackManager.popElement();
        stackManager.popElement();
        stackManager.isStackEmpty();


    }
}
