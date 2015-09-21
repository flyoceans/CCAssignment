public class Solution1{
	//Definition for singly-linked list.
	class ListNode{
		int data;
		ListNode next;
		ListNode(int x) { this.data = x;}
	}

	//Using the "runner" Technique introduced by our book, so we don't need temporary buffer.
	//This code runs in O(N2)time.
	public void removeDups (ListNode n){
		if (n == null) return;
		
		ListNode slow = n;
		while(slow.next != null)
		{
			ListNode fast = slow;
			if (slow.data == fast.next.data)
			{
				slow.next = fast.next.next;
			}else {
				slow = fast.next;
			}
			slow = slow.next;
		}
	}

}


