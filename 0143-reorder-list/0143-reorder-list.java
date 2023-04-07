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
    public void reorderList(ListNode head) {
        if(head== null || head.next==null) return;
        ListNode middle=findMid(head);
        ListNode head2=toReverse(middle);
        ListNode head1=head;
        // while(head1!=null){
        //     System.out.println(head1.val);
        //     head1=head1.next;
        // }
        //  while(head2!=null){
        //     System.out.print(head2.val);
        //     head2=head2.next;
        // }
        
        while(head1!=null && head2!=null){
        ListNode temp=head1.next;
            head1.next=head2;
            head1=temp;
            
            temp=head2.next;
            head2.next=head1;
            head2=temp;
        }
        if(head1!=null){
            head1.next=null;
        }
    }
    public ListNode toReverse(ListNode mid){
     ListNode prev=null;
        ListNode present=mid;
        ListNode future=present.next;
        while(present!=null){
        present.next=prev;
            prev=present;
            present=future;
            if(future!=null){
                   future=future.next;
                }
        }
        return prev;
    }
    public ListNode findMid(ListNode node){
        ListNode slow=node;
        ListNode fast=node;
        while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
        }
        return slow;
    }
}