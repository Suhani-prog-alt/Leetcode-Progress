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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        // if(k == 0 ) return head;
        int len = 0;
        ListNode l = head;
        ListNode prev = l;
        while(l!=null){
            len++;
            prev = l;
            l = l.next;
        }
        k = k%len;
        if(k == 0) return head;
        int cut = len - k ;
        int count = 0;
        ListNode L = head;
        ListNode ans = new ListNode();
        while(true){
            count++;
            if(count == cut){
                ans.next = L.next;
                L.next = null;
                break;
            }
            L = L.next;
        }
        prev.next = head;
        return ans.next;

    }
}
