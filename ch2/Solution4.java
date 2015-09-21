public class Solution4{
	//Definition for singly-linked list.
	class ListNode{
		int data;
		ListNode next;
		ListNode(int x) { this.data = x;}
	}

	//Divided the list into two parts, insert elements smaller than x into smaller list,
	//and greater ones into greater list.
	//Finally, we just need to merge those two lists.
	ListNode partition(ListNode n, int x){

		ListNode smallerhead = null;
		ListNode smallerend = null;
		ListNode greaterhead = null;
		ListNode greaterend = null;
		while(n.next != null)
		{
			if(n.data < x)
			{
				if (smallerhead == null)
				{
					smallerhead = n;
					smallerend = n;
				}
				else
				{
					smallerend.next = n;
					smallerend = n;
				}
			}
			else
			{
				if (greaterhead == null)
				{
					greaterhead = n;
					greaterend = n;
				}
				else
				{
					greaterend.next = n;
					greaterend = n;
				}
			}		
			n = n.next;
		}


		smallerend.next = greaterhead;

		return smallerhead;
	}
}