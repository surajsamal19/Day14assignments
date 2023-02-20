public class Stack {
    private Node top;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println(stack.pop()); // prints 56
        System.out.println(stack.pop()); // prints 30
        System.out.println(stack.pop()); // prints 70


    }
}
