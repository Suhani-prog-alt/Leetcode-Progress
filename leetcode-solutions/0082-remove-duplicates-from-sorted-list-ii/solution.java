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
        int [] arr = new int [201];
        ListNode L = head;
        while(L!=null){
            arr[L.val+100]++;
            L = L.next;
        }

        ListNode ans = new ListNode();
        ListNode res = ans;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==1){
                ListNode l = new ListNode(i-100);
                ans.next = l;
                ans = ans.next;
            }
        }
        return res.next;
    }
}
