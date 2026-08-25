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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = head;
        int c = 0;//size
        while (tmp != null) {
            tmp = tmp.next;
            c++;
        }
        if (n == c)     return head.next;
        ListNode temp = head;
        for (int i = 1;i < c - n; i++) temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}