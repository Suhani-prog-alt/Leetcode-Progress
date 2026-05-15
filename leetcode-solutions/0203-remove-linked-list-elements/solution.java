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
        if(head==null) return null;
        ListNode l = new ListNode();
        ListNode ans = l;
        while(head!=null){
            if(head.val!=val){
                l.next = head;
                head = head.next;
                l = l.next;
            }else{
                head = head.next;
            }
            l.next = null;
        }
        return ans.next;
    }
}
