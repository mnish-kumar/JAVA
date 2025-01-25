package Linked_list;


import Linked_list.Effective.ListNode;

class Linkedlist {
    int data;
    Linkedlist next;

    public Linkedlist(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Linkedlist current = this;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}

public class LL {
    //add
    public static Linkedlist add(Linkedlist head, int data) {
        Linkedlist newNode = new Linkedlist(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }

    //size
    public static int size (Linkedlist head ){
        if (head == null){
            return 0;
        }
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    //insert last
    public static Linkedlist insertLast(Linkedlist head , int data){
        Linkedlist newNode = new Linkedlist(data);
        if (head == null){
            return newNode;
        }
        Linkedlist temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    //delete first
    public static Linkedlist deleteFirst(Linkedlist head){
        if (head == null){
            return null;
        }

        head = head.next;
        return head;
    }

    //delete last
    public static Linkedlist deleteLast(Linkedlist head){
        if (head == null){
            return null;
        }
        Linkedlist temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //insert
    public static Linkedlist insert(Linkedlist head , int data , int index){
        int size = size(head);
        if (size < 0 || index > size){
            throw new IndexOutOfBoundsException("for size : " + size);
        }

        if (index == 0){
            return add(head , data);
        }

        Linkedlist temp = head;
        for (int i = 1; i <= index -1; i++){
            temp = temp.next;
        }
        Linkedlist newNode = new Linkedlist(data);
        Linkedlist hold = temp.next;

        temp.next = newNode;
        newNode.next = hold;
        return head;
    }

    //list create
    public static Linkedlist list() {
        Linkedlist head = new Linkedlist(10);
        Linkedlist h1 = new Linkedlist(20);
        Linkedlist h2 = new Linkedlist(30);
        Linkedlist h3 = new Linkedlist(40);
        Linkedlist h4 = new Linkedlist(50);
        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = null;
        return head;
    }

    public static void main(String[] args) {
        Linkedlist head = list();

//        head = add(head ,192);
//        System.out.println(head);
//        System.out.println("Size of the linked list is : " + size(head));

//        System.out.println("\nInsert node in the last of linked list.");
//        head = insertLast(head , 231);
//        System.out.println(head);
//        System.out.println("Size of the linked list is : " + size(head));


//        System.out.println("\nDelete the first head.");
//        System.out.println(deleteFirst(head));
//        System.out.println("Size of the linked list is : " + size(head));


        //System.out.println(deleteLast(head));

//        head = insert(head , 121 , 3);
//        System.out.println(head);

    }
}
