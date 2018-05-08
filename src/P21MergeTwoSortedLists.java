/**
 * Created by Eliza Liu on 2018/5/7
 */
public class P21MergeTwoSortedLists {
    public static void main(String[] args){

        ListNode l1 =  new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);

        ListNode l2 = new ListNode(1);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);

        l1.next = n2;
        n2.next = n3;
        l2.next = n4;
        n4.next = n5;

        ListNode result = mergeTwoLists(l1,l2);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode originNode = l1;
        if(l1==null )
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val < l2.val) {
            originNode = l1;
            l1 = l1.next;
        }
        else {
            originNode = l2;
            l2 = l2.next;
        }
        ListNode currentNode = originNode;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                originNode.next = l1;
                l1 = l1.next;
                originNode = originNode.next;

            }else{
                originNode.next = l2;
                l2 = l2.next;
                originNode = originNode.next;
            }
        }
        while(l1 != null){
            originNode.next = l1;
            originNode = originNode.next;
            l1 = l1.next;
        }
        while(l2!= null){
            originNode.next = l2;
            originNode = originNode.next;
            l2 = l2.next;
        }
        return currentNode;

    }

}
