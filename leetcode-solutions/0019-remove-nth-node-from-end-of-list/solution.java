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
        int len = 0;
        ListNode l = head;
        while(l!=null){
            l = l.next;
            len++;
        }
        if(n == len){
            return head.next;
        }
        int rem = len - n;
        len = 0;
        l = head;
        ListNode ans = l;
        while(l!=null){
            len++;
            if(len == rem){
                l.next = l.next.next;
                break;
            }else{
                l = l.next;
            }
            
        }
        return ans;
    }
}
