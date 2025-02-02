package Stack.Implementation;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist {
    private Node head;  // Head acts as the top of the stack

    // Constructor
    public Linkedlist() {
        this.head = null;
    }

    //check stack is empty
    boolean isEmpty() {
        return head == null;
    }

    //push in the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //pop the element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }

        int popData = head.data;
        head = head.next;
        return popData;
    }

    //peek the element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Linkedlist Stack = new Linkedlist();

        Stack.push(1);
        System.out.println(Stack);
    }
}
