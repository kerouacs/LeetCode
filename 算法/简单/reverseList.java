/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class reverseList {
    public ListNode reverseList(ListNode head) {
        ListNode p=head;
        ListNode q=null;
        while(p!=null){
            ListNode temp=p.next;
            p.next=q;
            q=p;
            p=temp;           
        }
        return q;
    }
}