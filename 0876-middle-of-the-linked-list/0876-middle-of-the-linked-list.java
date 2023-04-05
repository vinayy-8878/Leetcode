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
    public ListNode middleNode(ListNode head) {
        ListNode node=head;
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
            count=(count/2)+1;
        ListNode ans=head;
        ListNode answer=null;
        int i=1;
        while(ans!=null){
            if(i==count){
               answer=ans;
                answer.next=ans.next;
            }
            ans=ans.next;
            i++;
        }
  return answer;
    }
}