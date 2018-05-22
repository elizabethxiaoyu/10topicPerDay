
public class P203RemoveElements {
	
	  public ListNode removeElements(ListNode head, int val) {
	        
		ListNode current = head;
		ListNode lastNode = head;
		if(head == null)
			return head;
		while(current != null) {
			 if(current.val == val) {
				 if(current == head) {
					 head = current.next;
				 }else{
					 lastNode.next = current.next;
					 
				 }
				 current = current.next;
				 
			 }else {
				 lastNode = current;
				 current = current.next;
			 }
		}
		return head;
		  
	  }
}
