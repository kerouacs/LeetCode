/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){//无节点，单节点都是无环
            return false;
        }
        ListNode p=head;
        ListNode q=head.next;
        while(p!=q){
            if(q==null||q.next==null){//快指针一次动两，可能为奇数或偶数个，
                return false;
            }
            p=p.next;
            q=q.next.next;
        }
        return true;
    }
}