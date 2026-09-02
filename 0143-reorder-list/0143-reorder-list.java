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
    public void reorderList(ListNode head) {
        if (head == null)   return ;
        ListNode mid = findmid(head);
        ListNode h2 = mid.next;
        mid.next = null;
        h2 = rev(h2);
        ListNode temp = head;
        ListNode ptr = head;
        while (h2 != null) {
            head = head.next;
            ptr.next = h2;
            h2 = h2.next;
            ptr = ptr.next;
            ptr.next = head;
            ptr = ptr.next;
        }

    }
    ListNode findmid(ListNode h) {
        ListNode a = h, b = h.next;//fast & slow ptr
        while (b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
        }
        return a;
    }
    ListNode rev(ListNode h) {
        if (h == null)  return h;
        ListNode prev = null;
        while (h != null) {
            ListNode temp = h.next;
            h.next = prev;
            prev = h;
            h = temp;
        }
        return prev;
    }
}