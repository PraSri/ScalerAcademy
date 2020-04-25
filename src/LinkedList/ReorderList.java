package LinkedList;

public class ReorderList {

	public static void main(String[] args) {

	}

	public class Solution {
    	public ListNode reorderList(ListNode A) {
    	    
    	    if(A.next == null){
    	        return A;
    	    }
    	    
		ListNode mid = midOfLL(A);

		ListNode p2 = mid.next;

		mid.next = null;

		p2 = reverseLL(p2);

		ListNode head1 = A;
		ListNode head2 = p2;
		
		 while (head2 != null) {
            ListNode next = head1.next;
            head1.next = head2;
            head1 = head2;
            head2 = next;
        }

// 		p1 = mergeLL(p1, p2);

		return A;

	}

	private ListNode mergeLL(ListNode p1, ListNode p2) {
		ListNode r = p1;
		while(p2!=null){
		    ListNode n = p1,next;
		    p1.next = p2;
		    p1=p2;
		    p2 = n;
		}

		return r;
	}

	private ListNode reverseLL(ListNode head) {
		ListNode curr = head, prev = null, next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return prev;
	}

	private ListNode midOfLL(ListNode head) {
		ListNode slow = head, fast = head.next;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
