package Linked_list.Effective;

public class drive {

    //Print Linked List
    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("null");
    }

    //Print Recursive
    public static void printRecursive(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.val + " -> ");
        printRecursive(head.next);
    }

    //Find size of nodes
    public static int size(ListNode head) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    //Insert First
    public static ListNode insertFirst(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    //Insert Last
    public static ListNode insertLast(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //Delete First
    public static ListNode deleteFirst(ListNode head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }

    //Delete Last
    public static ListNode deleteLast(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //Insert Node Anywhere
    public static ListNode insert(ListNode head, int val, int index) {
        int size = size(head);

        if (size < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("For size : " + size);
        }

        if (index == 0) {
            return insertFirst(head, val);
        }

        ListNode temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }

        ListNode newNode = new ListNode(val);

        ListNode hold = temp.next;
        temp.next = newNode;
        newNode.next = hold;
        return head;
    }

    //Delete Node
    public static ListNode delete(ListNode head, int index) {
        int size = size(head);
        if (size < 0 || index >= size) {
            throw new IndexOutOfBoundsException("For size : " + size);
        }
        if (index == 0) {
            return deleteFirst(head);
        }

        ListNode temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }


    public static ListNode createList() {
        ListNode head = new ListNode(10);
        ListNode h1 = new ListNode(20);
        ListNode h2 = new ListNode(30);
        ListNode h3 = new ListNode(40);
        ListNode h4 = new ListNode(50);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = createList();
        //print
        //print(head);

        //Print recursive
        //System.out.println("Recursive Print:");
        //printRecursive(head);

        //size
        //System.out.println(size(head));

        //Insert first
//        head = insertFirst(head , 23);
//        System.out.println("After inserting 23 at the beginning:");
//        System.out.println(head);
//        System.out.println(size(head));

        //Insert Last
        //head = insertLast(head , 70);
        //System.out.println("After inserting 70 at the Last:");
        //System.out.println(head);

        //Delete first
        //System.out.println(deleteFirst(head));

        //Delete Last
        //System.out.println(deleteLast(head));

        //Insert
        //System.out.println(insert(head, 32, 2));

        //Delete Anywhere
        //System.out.println(delete(head , 2));
    }
}
