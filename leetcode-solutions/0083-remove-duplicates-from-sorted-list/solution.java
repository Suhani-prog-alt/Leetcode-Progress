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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;
        ListNode l = new ListNode();
        ListNode ans = l;
        l.next = head;
        l = l.next;
        head = head.next;
        
        while(head!=null){
            if(l.val!=head.val){
                l.next = head;
                l = l.next;
                head = head.next;
                l.next = null;
            }else{
                head = head.next;
                l.next = null;
            }
        }
        return ans.next;
    }
}
