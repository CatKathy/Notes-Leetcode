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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //定义一个虚拟节点
        ListNode dummy = new ListNode(0);
        dummy.next = head; 
        
        //定义快慢指针
        ListNode slow = dummy;
        ListNode fast = dummy; 
        
        //当i<=n的时候，快指针fast前进n+1
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        
        //fast和slow间距n
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //定义一个待删除节点，为slow的下一个
        ListNode delNode = slow.next;
        //slow指向slow的后两个节点
        slow.next = delNode.next;

        //把del当作独立个体来看，指向null 删除del节点
        delNode.next = null; //如果没有指向空，会直接跳过，输出结果一致，根据题目要求来看

       //返回从head开始的所有数
        return dummy.next;
    }
}
