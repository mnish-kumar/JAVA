package Linked_list;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

}

public class start {

    //method for printing node
    public static void print(Node head) {
        while (head != null) {
            System.out.println("Value of head -> " + head.val);
            head = head.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        //linked-list
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //traversal
        print(a);
    }
}
