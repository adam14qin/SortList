
public class Merge {
	public static void main(String args[]){
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(4);
		l2.next=new ListNode(3);
		l2.next.next=new ListNode(5);
        ListNode prehead=new ListNode(-1);
        ListNode prev=prehead;
        while (l1!=null && l2!=null){
            if (l1.val<l2.val) {prev.next=l1; l1=l1.next;}
            else {prev.next=l2;l2=l2.next;}
            prev=prev.next;
        }
        if (l1!=null) prev.next=l1;
        if (l2!=null) prev.next=l2;
	}
}
