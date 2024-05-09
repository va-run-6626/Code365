package Day_37.Varun;
import java.util.*;
import Day_0_GenericClasses.ListNode;

public class DoubleANumberRepresentedAsALinkedList {
    public static void main(String[] args) {
        int[] nodes = {3,4,5,4,2,5,5,9,9,9};
        ListNode head = new ListNode(nodes[0]);
        ListNode curr = head;
        for(int i = 1; i < nodes.length; i++){
            ListNode temp = new ListNode(nodes[i]);
            curr.next = temp;
            curr = curr.next;
        }
        ListNode.Print(head);
        Solution sol = new Solution();
        head = sol.doubleIt(head);
        ListNode.Print(head);

    }
}
class Solution {
    public ListNode doubleIt(ListNode head) {
        if (head.val > 4) {
            head = new ListNode(0, head);
        }

        ListNode temp = head;
        while (temp != null) {
            temp.val = (temp.val * 2) % 10;
            if (temp.next != null && temp.next.val > 4) {
                temp.val++;
            }
            temp = temp.next;
        }
        return head;
    }
}