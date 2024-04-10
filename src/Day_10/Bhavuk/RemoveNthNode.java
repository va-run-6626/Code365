package Day_10.Bhavuk;


public class RemoveNthNode {
     public static void main(String[] args) {
         // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
         head.next.next.next.next = new ListNode(5);

         // Create an instance of the Day_10.Bhavuk.Solution class
         Solution solution = new Solution();

         // Remove the 2nd node from the end
         int n = 2;
         ListNode result = solution.removeNthFromEnd(head, n);

         // Print the modified linked list
         while (result != null) {
             System.out.print(result.val + " ");
             result = result.next;
         }
     }
  }
// Define the Day_10.Bhavuk.ListNode class
 class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
 }

// Define the Day_10.Bhavuk.Solution class
 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int traverseTill = length - n - 1;
        int i = 0;
        if (traverseTill == -1)
            return head.next;
        ListNode point = head;
        while (i < traverseTill) {
            point = point.next;
            i++;
        }
        point.next = point.next.next;
        return head;
    }

    public int findLength(ListNode head) {
        int count = 0;
        if (head == null)
            return count;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
 }

