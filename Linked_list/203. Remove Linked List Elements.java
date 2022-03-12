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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        
        
        if (head == null){
            return head;
        }
        
        ListNode p = head;
        ListNode t = head.next;
        
        while (t != null){
            if (t.val == val){
                p.next = t.next;
            }else {
                p = t;
            }
            t = t.next;
        }
        return head;
        
    }
}
