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
        ListNode s = new ListNode(-1);
        ListNode g = new ListNode(-1);
        ListNode t=head;
        ListNode ts=s;
        ListNode tg=g;
        while(t!=null){
            if(t.val<x){
                ts.next=t;
                ts=ts.next;
            }else{
                tg.next=t;
                tg=tg.next;
            }
            t=t.next;
        }
        tg.next=null;
        ts.next=g.next;
        return s.next;
    }
}