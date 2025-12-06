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
        ListNode lessDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);

        ListNode lessTail = lessDummy;
        ListNode greaterTail = greaterDummy;
        ListNode temp = head;

        while(temp != null)
        {
            ListNode nxt = temp.next;
            temp.next = null;

            if(temp.val < x)
            {
                lessTail.next = temp;
                lessTail = lessTail.next;
            }
            else
            {
                greaterTail.next = temp;
                greaterTail = greaterTail.next;
            }
            temp = nxt;
        }

        lessTail.next = greaterDummy.next;;
        

        return lessDummy.next;
        
    }
}
