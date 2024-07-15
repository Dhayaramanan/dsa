package LinkedList;

public class MiddleOfTheLinkedList {
    // solution code starts
    public ListNode middleNode(ListNode head) {
        int size = sizeOfLL(head);
        return targetNode(head, size/2, size);
    }

    public int sizeOfLL(ListNode head) {
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }

    public ListNode targetNode(ListNode head, int index, int size) {
        ListNode temp = head;
        for (int i = 0; i < size; ++i) {
            if (i == index) return temp;
            temp = temp.next;
        }
        return head;
    }
    // solution code ends
}
