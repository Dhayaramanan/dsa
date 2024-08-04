package LeetCode75.LinkedList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        int length = calculateLength(head);
        if (length == 1) {
            head = null;
            return head;
        }
        int mid = length/2;

        ListNode temp = head;
        int index = 0;
        while (index < mid-1) {
            System.out.println(temp.val);
            index++;
            temp = temp.next;
        }
        ListNode middle = temp.next;
        temp.next = middle.next;
        middle.next = null;

        return head;
    }

    public static int calculateLength(ListNode head) {
        ListNode temp = head;

        int length = 0;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        return length+1;
    }
}
