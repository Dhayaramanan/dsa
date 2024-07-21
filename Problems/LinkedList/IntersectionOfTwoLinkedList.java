package LinkedList;

import java.util.HashMap;

public class IntersectionOfTwoLinkedList {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> p = new HashMap<>();

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != null) {
            p.put(temp1, temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            if (p.get(temp2) != null)
                return temp2;
            temp2 = temp2.next;
        }
        return null;
    }
}
