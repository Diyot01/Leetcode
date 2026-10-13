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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ListNode i=head;
        while(i!=null){
            st1.push(i.val);
            i=i.next;
        }
        int max=0;
        while(st1.size()>0){
            int num=st1.peek();
            if(num>=max){
                max=num;
                st2.push(st1.pop());
            }else{
                st1.pop();
            }
        }
        ListNode h = null;
        ListNode tail = null;
        while (!st2.isEmpty()) {
            int v = st2.pop();
            ListNode t = new ListNode(v);
            if(h==null){
                h=t;
                tail=t;
            }else{
                tail.next=t;
                tail=t;
            }
        }
        return h;
    }
}