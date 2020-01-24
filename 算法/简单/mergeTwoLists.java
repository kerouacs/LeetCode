/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre=new ListNode(-1);
        ListNode cur=pre;
        while(l1!=null&&l2!=null){//没有.next 因为先移了，再判断。
            if(l1.val<=l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1==null) cur.next=l2;
        if(l2==null) cur.next=l1;
        return pre.next;
    }
}