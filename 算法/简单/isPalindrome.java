/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class isPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode p=new ListNode (-1);
        p.next=head;
        ListNode slow=p;
        ListNode fast=p;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur=slow.next;
        ListNode pre=null;        
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        while(pre!=null){
            if(pre.val!=p.next.val){
                return false;
            }
            pre=pre.next;
            p.next=p.next.next;
        }
        return true;
    }
}