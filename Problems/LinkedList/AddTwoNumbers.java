package LinkedList;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode head = new ListNode((p1.val + p2.val)%10);
        int val = (p1.val + p2.val)/10;
        ListNode temp = head;

        p1 = p1.next;
        p2 = p2.next;

        while (p1 != null && p2 != null) {
            int sum = p1.val + p2.val;
            ListNode n = new ListNode((sum+val)%10);
            val = (sum+val)/10;
            temp.next = n;
            temp = n;
            p1 = p1.next;
            p2 = p2.next;
        }
        while (p1 != null) {
            int sum = p1.val + val;
            ListNode n = new ListNode(sum%10);
            val = sum/10;
            temp.next = n;
            temp = n;
            p1 = p1.next;
        }
        while (p2 != null) {
            int sum = p2.val + val;
            ListNode n = new ListNode(sum % 10);
            val = sum / 10;
            temp.next = n;
            temp = n;
            p2 = p2.next;
        }
        if (val != 0) {
            ListNode n = new ListNode(val);
            temp.next = n;
            temp = n;
        }
        temp.next =null;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(7);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);

        ListNode temp = addTwoNumbers(l1, l2);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

/*
BEST SOLUTION - The mistake I made was instead of checking || and one or two more conditions inside loop, I did && check
Noticed the mistake, will improve...

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

 */
