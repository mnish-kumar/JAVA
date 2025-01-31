package Queue;

import java.util.Arrays;

public class Queue {
    private int rear = -1; // Rear of the queue
    private int front = 0; // Front of the queue
    private int size;      // Maximum size of the queue
    private int[] arr;     // Array to store queue elements
    private int currentSize = 0; // Current number of elements in the queue

    Queue(int n) {
        this.size = n;
        arr = new int[size];
    }

    //empty or not
    public boolean isEmpty() {
        return currentSize == 0;
    }

    //queue is full
    public boolean isFull() {
        return currentSize == size;
    }

    //add -> enqueue
    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full !");
            return;
        }

        rear++;
        arr[rear] = data;
        currentSize++;
    }

    //remove ->dequeue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty not delete");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        currentSize--;
        return front;
    }

    //peek
    public int peek(){
        if (isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[front];
    }

    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr) ;
    }

    public static void main(String[] args) {
        int n = 5;
        Queue q = new Queue(n);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
    }
}
