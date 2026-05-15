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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1){
            ListNode l = null;
            return l;
        }
        if(lists.length == 1) return lists[0];
        ListNode ans = lists[0];
        for(int i = 1; i<lists.length; i++){
            ans = merge(ans,lists[i]);
        }

        return ans;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode ans = new ListNode();
        ListNode res = ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                ans.next = l1;
                l1 = l1.next;
                ans = ans.next;
            }else{
                ans.next = l2;
                l2 = l2.next;
                ans = ans.next;
            }
        }
        if(l1!=null){
            ans.next = l1;
            ans = ans.next;
        }
        if(l2!=null){
            ans.next = l2;
            ans = ans.next;
        }
        return res.next;
    }
}
