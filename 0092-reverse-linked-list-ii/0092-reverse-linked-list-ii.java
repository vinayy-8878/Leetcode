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
        if(head==null || left==right) return head;
        
        ListNode present=head;
        ListNode previous=null;
        for(int i=0 ;i<left-1;i++){
            previous=present;
            present=present.next;
        }
        ListNode last=previous;
        ListNode newEnd=present;
        ListNode future=present.next;
        for(int i=0;i<right-left+1;i++){
            present.next=previous;
            previous=present;
            present=future;
            if(future!=null){
                future=future.next;
            }
        }
        if(last!=null){
           last.next=previous;
        }
        else{
            head=previous;
        }
        newEnd.next=present;
        return head;
    }
}