package LinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        StringBuilder nodes = new StringBuilder();
        ListNode temp = head;

        while (temp != null) {
            nodes.append(temp.val);
            temp = temp.next;
        }

        return nodes.toString().equals(nodes.reverse().toString());
    }
}
