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
    public ListNode swapPairs(ListNode head) {
        Stack<ListNode> st = new Stack();
        ListNode ans = new ListNode();
        ListNode rs = ans;
        while(head!=null){
            while(head!=null && st.size()<2){
                st.push(head);
                head = head.next;
            }
            if(st.size()==2){
                while(!st.isEmpty()){
                    ans.next = st.pop();
                    ans = ans.next;
                    ans.next = null;
                }
            }else{
                ans.next = st.pop();
                ans = ans.next;
                ans.next = null;
            }
        }
        return rs.next;
    }
}
