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
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(0);
        ListNode biggerHead = new ListNode(0);

        ListNode small = smallerHead;
        ListNode big = biggerHead;

        ListNode list = head;
        while(list!=null){
            if(list.val<x){
                small.next = list;
                small = small.next;
            }else{
                big.next = list;
                big = big.next;
            }
            list = list.next;
        }
        big.next = null;
        small.next = biggerHead.next;
        return smallerHead.next;
    }
}
