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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null )return head;
        int len = length(head);
        k = k%len;
        if(k == 0) return head;
        ListNode first = head;
        ListNode temp = head;
        ListNode last = head;
        while(temp!=null){
            last = temp;
            temp = temp.next;  
        }
        int c = len - k;
        int count = 0;
        temp = head;
        while(temp!=null){
            count++;
            if(count == c)break;
            head = head.next;
        }
        ListNode ans = head.next;
        head.next = null;
        last.next = first;
        return ans;
    }

    public static int length(ListNode head){
        int n = 0;
        while(head!=null){
            head = head.next;
            n++;
        }
        return n;
    }
}
