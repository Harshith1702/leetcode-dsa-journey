/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)   return head;
        ListNode temp = head;
        while (head.next != null) {
            if (val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        if (temp.val == val)
            temp = temp.next;
        return temp;
    }
}