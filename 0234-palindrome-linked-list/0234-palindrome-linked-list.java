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
    public boolean isPalindrome(ListNode head) {
        ListNode head1 =head;
       ListNode middle=findMid(head);
       ListNode reverse=doReverse(middle);
        // while(reverse != null){
        //     System.out.println(reverse.val + " ");
        //     reverse = reverse.next;
        // }
        // System.out.println(head1.val +" " + middle.val + " " + reverse.val);
   //    ListNode headSecond=reverse;
       while(head!=null && reverse!=null){
         if(head.val!=reverse.val) {
            
             break;
         }
            
           head=head.next;
           reverse=reverse.next;
       }
        // System.out.println(head.val);
        //      System.out.println(reverse.val);
       
       return (head==null || reverse==null);
    }
    public ListNode doReverse(ListNode mid){
        if(mid==null) return mid;
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
        // while(prev!=null){
        //     System.out.println(prev.val);
        //     prev=prev.next;
        // }
         return prev;
    }
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
           // System.out.println(slow.val);
            fast=fast.next.next;
        }
        return slow;
    }
}