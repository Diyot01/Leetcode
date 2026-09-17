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
    public ListNode oddEvenList(ListNode head) {
        ListNode t1= new ListNode(-1);
        ListNode t2= new ListNode(-1);
        ListNode h1= t1;
        ListNode h2= t2;
        ListNode i= head;
        int c=0;
        while(i!=null){
            if(c%2==0){
                h1.next=i;
                h1=h1.next;
            }else{
                h2.next=i;
                h2=h2.next;
            }
            i=i.next;
            c++;
        }
        h2.next=null;
        h1.next=t2.next;
        return t1.next;
    }
}