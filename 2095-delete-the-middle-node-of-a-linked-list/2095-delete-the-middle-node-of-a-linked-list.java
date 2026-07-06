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
    public ListNode deleteMiddle(ListNode head) {
        int idx=0;
        ListNode temp=head;
        while(temp!=null){
            idx++;
            temp=temp.next;
        }
        temp=head;
        if(idx==1) return head.next;
        for(int i=1;i<idx/2;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}