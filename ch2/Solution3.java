public class Solution3{
	//Definition for singly-linked list.
	class ListNode{
		int data;
		ListNode next;
		ListNode(int x) { this.data = x;}
	}

	//Since we are not given the previous node of n, 
	//we could let n copy n.next, and then delete n.next to 
	//implement this algorithm.
	void delMidNode(ListNode n){
		if (n == null || n.next == null) return;

		n.data = n.next.data;
		n.next = n.next.next;

	}

}