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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode ans = new ListNode();
        ListNode res = ans;
        Stack<Integer> st = new Stack<>();
        ListNode l = head;
        int count = 0;
        while(l!=null){
            count++;
            if(count>=left && count<=right){
                st.push(l.val);
            }
            l = l.next;
        }

        l = head;
        count = 0;
        while(l!=null){
            count++;
            if(count>=left && count<=right){
                ListNode L = new ListNode(st.pop());
                ans.next = L;
                ans = ans.next;
            }else{
                ans.next = l;
                ans = ans.next;
            }
            l = l.next;
        }
        return res.next;
    }
}
