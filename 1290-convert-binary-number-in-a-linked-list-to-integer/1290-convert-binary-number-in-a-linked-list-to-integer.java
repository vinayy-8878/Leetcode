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
    public int getDecimalValue(ListNode head) {
        ListNode node=head;
        int result=0;
        
        while(node!=null)
        {
            int val=node.val;
            result=result*2+val;
            node=node.next;
        }
        return result;
    }
}