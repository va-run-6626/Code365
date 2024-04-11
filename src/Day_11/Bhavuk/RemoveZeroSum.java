package Day_11.Bhavuk;
import java.util.HashMap;

public class RemoveZeroSum {
    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> -3 -> 3 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(-3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);

        // Creating an instance of Solution class
        Solution solution = new Solution();

        // Removing zero-sum sublists
        ListNode result = solution.removeZeroSumSublists(head);

        // Printing the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        map.put(0, dummy);
        while (head != null) {
            prefixSum += head.val;
            if (map.containsKey(prefixSum)) {
                ListNode start = map.get(prefixSum);
                ListNode temp = start;
                int sum = prefixSum;
                while (temp != head) {
                    temp = temp.next;
                    sum += temp.val;
                    if (temp != head)
                        map.remove(sum);
                }
                start.next = head.next;
            } else {
                map.put(prefixSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}
