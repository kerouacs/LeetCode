//对于链表问题，返回结果为头结点时，通常需要先初始化一个预先指针 pre，该指针的下一个节点指向真正的头结点head。
//使用预先指针的目的在于链表初始化时无可用节点值，
//而且链表构造过程需要指针移动，进而会导致头指针丢失，无法返回结果。


class addTwoNumbers{
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p = l1; ListNode q = l2;
        ListNode pre= new ListNode(0);
        ListNode cur= pre;
        while(p!=null || q!=null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum=x+y+carry;
            carry=sum/10;
            cur.next = new ListNode(sum%10);
            cur=cur.next;
            if (p!=null)   p=p.next;
            if (q!=null)   q=q.next;
        }
        if(carry>0){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}