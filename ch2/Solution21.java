public class Solution21{
	//Definition for singly-linked list.
	class ListNode{
		int data;
		ListNode next;
		ListNode(int x) { this.data = x;}
	}

	//Using the "runner" technique, we could put the fast pointer k nodes 
	//faster than the slow pointer, so when fast move to the end, slow pointer
	//would hit the kth to last.
	public ListNode reKtolast(ListNode n, int k){
		if (n == null) return null;
			
		ListNode fast = n;
		ListNode slow = n;
		int i = 0;
		while(i != k)
		{
			i++;
			fast = slow.next;
		}

		while(fast.next != null)
		{
			fast.next = fast.next;
			slow.next = slow.next;
		}
		return slow;
	}
}