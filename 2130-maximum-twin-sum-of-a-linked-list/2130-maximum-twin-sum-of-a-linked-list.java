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
    public int pairSum(ListNode head) {
        int n=0;
        int sum=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int[] arr = new int[n]; //brute force
        temp=head;
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        for(int i=0;i<n;i++){
            sum=arr[i]+arr[n-1-i];
            max=Math.max(sum,max);
        }
        return max;
    }
}