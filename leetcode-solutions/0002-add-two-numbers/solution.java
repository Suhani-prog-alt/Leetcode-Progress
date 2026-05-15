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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode res = ans;
        int pow = 0;
        while(l1!=null && l2!=null){
            int digi = l1.val + l2.val + pow;
            pow = digi/10;
            ListNode rem = new ListNode( digi%10);
            ans.next = rem;
            ans = ans.next;
            l1 = l1.next ;
            l2 = l2.next ;

        }
        while(l1!=null){
            int digi = l1.val + pow;
            pow = digi/10;
            ListNode rem = new ListNode( digi%10);
            ans.next = rem;
            ans = ans.next;
            l1 = l1.next ;
        }
        while(l2!=null){
            int digi = l2.val + pow;
            pow = digi/10;
            ListNode rem = new ListNode( digi%10);
            ans.next = rem;
            ans = ans.next;
            l2 = l2.next ;
        }
        if(pow!=0){
            ListNode rem = new ListNode( pow);
            ans.next = rem;
        }
        return res.next;
    }
}
