package Linked_list.LinkedList_Project;


class linkedlist {
    int val;
    linkedlist next;

    public linkedlist(int val) {
        this.val = val;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        linkedlist current = this;
        while (current != null) {
            result.append(current.val).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}


public class Questions {
    public static linkedlist list() {
        linkedlist head = new linkedlist(9);
        linkedlist h1 = new linkedlist(9);
        linkedlist h2 = new linkedlist(9);
        linkedlist h3 = new linkedlist(9);

        head.next = h1;
        h1.next = h2;
        h2.next = h3;
        h3.next = null;

        return head;
    }

    //find mid
    public static linkedlist getMid(linkedlist head) {
        if (head == null) return null;

        linkedlist slow = head;
        linkedlist fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //reverse linked
//    public static linkedlist reverse(linkedlist head) {
//
//        linkedlist previous = null;
//        linkedlist current = head;
//
//        if (head == null) {
//            return null;
//        }
//
//        while (current != null) {
//            linkedlist forward = current.next;
//
//            current.next = previous;
//            previous = current;
//            current = forward;
//        }
//
//        return previous;
//    }

    //Cyclic or not
    public static boolean isCyclic(linkedlist head) {
        if (head == null) return false;

        linkedlist slow = head;
        linkedlist fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //Create reverse method through recursion
    public static linkedlist reverse(linkedlist previous , linkedlist current){
        if (current == null) return previous;

        linkedlist forward = current.next;
        current.next = previous;
        previous = current;
        current = forward;
        return reverse(previous , current);
    }

    public static void main(String[] args) {

        linkedlist head = list();
        //Add one number
      //  System.out.println(reverse(null , head));
        head = reverse(null , head);
        int carry = 1;
        linkedlist temp = head;
        while (temp != null){
            int sum = carry + temp.val;
            int digit = sum % 10;
            temp.val = digit;
            carry = sum  / 10;

            if (temp.next == null && carry != 0){
                linkedlist newNode = new linkedlist(carry);
                newNode.next = null;
                temp.next = newNode;
                temp = newNode;
            }
            temp = temp.next;
        }
        head = reverse(null , head);
        System.out.println(head);

        //Middle of the Linked List / Slow & Fast Pointer
//        if (head == null && head.next == null) return;
//
//        linkedlist slow = head;
//        linkedlist fast = head;
//
//        while (fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        System.out.println(slow);

        //II -> Approch
//        int size = 0;
//        linkedlist temp = head;
//        while (temp != null){
//            size++;
//            temp = temp.next;
//        }
//        int mid = size/2;
//        temp = head;
//        while (mid-- > 0){
//            temp = temp.next;
//        }
//        System.out.println(temp.val);

        //Reverse linked list
        //System.out.println(reverse(head));


        //Merge two sorted linked list
//        linkedlist l1 = head;
//        linkedlist l2 = head;
//        linkedlist dummy = new linkedlist(0);
//        linkedlist ans = dummy;
//
//        while (l1 != null && l2 != null){
//            if (l1.val <= l2.val){
//                ans.next = l1;
//                l1= l1.next;
//            }else {
//                ans.next = l2;
//                l2 = l2.next;
//            }
//            ans = ans.next;
//        }
//        if (l1 == null){
//            ans.next = l2;
//        }else {
//            ans.next = l1;
//        }
//        System.out.println(ans.next);


        //Linked List Cycle (Floyd’s Cycle-Finding Algorithm)
        //System.out.println(isCyclic(head));

        //Middle of the linkedlist delete
//        //System.out.println(head);
//        linkedlist storeMid = getMid(head);
//        linkedlist temp = head;
//        while (temp.next != storeMid){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        System.out.println(head);
    }
}
