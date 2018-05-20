/**
 * Created by Eliza Liu on 2018/5/19
 */
public class P141CycledList {

    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        if(head == null || head.next == null)
            return false;

        while(first != null && first.next != null){
            first = first.next.next;
            second = second.next;
            if(first == second)
                return true;
        }
        return false;
    }
}
