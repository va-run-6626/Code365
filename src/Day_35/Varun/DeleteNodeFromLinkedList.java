package Day_35.Varun;

import Day_0_GenericClasses.ListNode;

public class DeleteNodeFromLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode a1 = new ListNode(20);
        ListNode a2 = new ListNode(30);
        ListNode a3 = new ListNode(40);
        ListNode a4 = new ListNode(50);

        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        Solution sol = new Solution();
        ListNode.Print(head);
        sol.deleteNode(a3);
        ListNode.Print(head);

    }
}
class Solution{
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
