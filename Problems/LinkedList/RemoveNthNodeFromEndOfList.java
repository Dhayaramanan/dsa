package LinkedList;

public class RemoveNthNodeFromEndOfList {
    // solution
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);
        int target = size - n;

        if (target == 0) {
            head = head.next;
            return head;
        }

        ListNode temp = head;
        for (int i = 0; i < target-1; ++i) {
            temp=temp.next;
        }

        ListNode nextNode = temp.next;
        if (nextNode != null) {
            temp.next = temp.next.next;
        } else {
            head = null;
        }

        return head;
    }

    public int getSize(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
