package Linked_list.Effective;


public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode current = this;
        while (current != null) {
            result.append(current.val).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}

