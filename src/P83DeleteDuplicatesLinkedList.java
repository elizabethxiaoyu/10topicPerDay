/**
 * Created by Eliza Liu on 18-5-8
 */
public class P83DeleteDuplicatesLinkedList {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;

        ListNode head = deleteDuplicates(l1);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        if(head.next ==null)
            return head;
        ListNode cur = head;
        ListNode next = head.next;
        while(next.next != null){
            if(cur.val != next.val){
                cur.next = next;
                cur = next;
            }
            next = next.next;
        }
        if(cur.val == next.val)
            cur.next =null;
        else
            cur.next = next;
        return head;
    }

}
