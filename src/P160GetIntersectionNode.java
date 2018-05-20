/**
 * Created by Eliza Liu on 2018/5/19
 */
public class P160GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        int lengthA = 0;
        int lengthB = 0;
        ListNode A = headA;
        ListNode B = headB;
        while(A!=null){
            lengthA++;
            A= A.next;
        }
        while(B!=null){
            lengthB++;
            B= B.next;
        }
        int diff = Math.abs(lengthA-lengthB);
        if(lengthA>lengthB){
            while(diff!=0){
                headA=headA.next;
                diff--;
            }

        }else{
            while(diff!=0){
                headB=headB.next;
                diff--;
            }

        }

        while(headA != null && headB!=null){
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB= headB.next;
        }
        return null;


    }
}
