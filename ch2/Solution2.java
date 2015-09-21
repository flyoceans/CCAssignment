public class Solution2{
	//If we know the length of linked list.
	//Definition for singly-linked list.
	class ListNode{
		int data;
		ListNode next;
		ListNode(int x) { this.data = x;}
	}

	public ListNode reKtolast(ListNode n, int k, int length){
		if (n == null) return null;

		int i = 0;
		while (i != length - k)
		{
			i ++;
			n = n.next;
			
		}
		return n;
	}
}



