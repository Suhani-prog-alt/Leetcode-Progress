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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode step1 = head;
        ListNode step2 = head;
        ListNode prev = head;
        while(step2!=null && step2.next!=null){
            prev = step1;
            step1 = step1.next;
            step2 = step2.next.next;
            if(step2==null || step2.next==null){
                prev.next = prev.next.next;
                break;
            }
        }
        return head;
    }
}
