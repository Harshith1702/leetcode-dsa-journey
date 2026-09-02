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
    public ListNode sortList(ListNode head) {
        List<Integer> s = new ArrayList<>();
        if (head == null || head.next == null)  return head;
        ListNode curr = head;
        while (curr != null) {
            s.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(s);
        curr = head;
        for (int x : s) {
            curr.val = x;
            curr = curr.next;
        }
        return head;
    }
}