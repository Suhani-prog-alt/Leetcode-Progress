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
        if(lists.length==0)return null;
        if(lists.length==1){
            return lists[0];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i= 0; i<lists.length; i++){
            while(lists[i]!=null){
                pq.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        if(pq.isEmpty())return null;
        ListNode res = new  ListNode(pq.poll());
        ListNode ans = res;
        while(!pq.isEmpty()){
            res.next = new ListNode(pq.poll());
            res = res.next;
        }
        return ans;
    }
}
