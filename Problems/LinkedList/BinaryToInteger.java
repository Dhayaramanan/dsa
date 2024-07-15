package LinkedList;

// given definition of linked list
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class BinaryToInteger {

    // solution code
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        ListNode temp = head;
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        int number = 0;

        int power = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '1') {
                number += (int)Math.pow(2, power);
            }
            power++;
        }
        return number;
    }
}
