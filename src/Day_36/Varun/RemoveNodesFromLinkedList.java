package Day_36.Varun;
import Day_0_GenericClasses.ListNode;

import java.util.*;
public class RemoveNodesFromLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(13);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(8);

        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;

        ListNode.Print(head);
        head = new Solution().removeNodes(head);
        ListNode.Print(head);
    }
}
class Solution{
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        stack.push(head);
        ListNode curr = head.next;
        while(curr != null){
            while(!stack.isEmpty() && curr.val > stack.peek().val){
                stack.pop();
            }
            stack.push(curr);
            curr = curr.next;
        }
        curr = stack.pop();
        while(!stack.isEmpty()){
            ListNode out = stack.pop();
            out.next = curr;
            curr = out;
        }
        return curr;
    }
}
