/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tail = null;
        ListNode p = head;
        while(p!=null){
            head = p.next;
            p.next = tail;
            tail = p;
            p = head;
        }
        
        return tail;
    }
}