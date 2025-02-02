package Stack.Implementation;


import java.util.Arrays;
import java.util.EmptyStackException;

public class Array_Imple {
    private int arr[];
    private int size;
    private int top;

    public Array_Imple(int capacity) {
        this.size = capacity;
        this.arr = new int[size];
        this.top = -1;
    }


    //push
    public void push(int data) {
        if (top == size - 1) {
            throw new StackOverflowError(size + "StackOverflow...");
        }

        top++;
        arr[top] = data;
    }

    //pop
    public int pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        int popData = arr[top];
        arr[top] = 0;
        top--;
        return popData;
    }

    //peek
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty , So i can't peek.");
            return -1;
        }
        return arr[top];
    }

    //getSize
    public int size() {
        return top + 1;
    }

    //isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        int[] activeElements = Arrays.copyOfRange(arr, 0, top + 1); // Only include active elements
        return "Array_Stack -> " +
                Arrays.toString(activeElements) +  // Display only active elements
                "\nsize= " + size +                // Capacity of stack
                "\ncurrentSize= " + (top + 1) +    // Actual number of elements in the stack
                "\ntop= " + top;                   // Current top index
    }

    public static void main(String[] args) {
        Array_Imple st = new Array_Imple(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        st.pop();
        System.out.println(st);
    }
}
