import java.util.Stack;

public class Solution6{
//		Using stack record the first half of the list.
//		We could use the runner techique to find out the middle elements of the list.
// 		and then we just need to compare the stack and the second half.
	public boolean palindrome(ListNode n){
		ListNode fast = n;
		ListNode slow = n;

		Stack<Integer> stack = new Stack<Integer>();
		while (fast.next != null && fast != null)
		{
			stack.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null){		//If the length of linkedlist is odd, we have to move one more step.
			slow = slow.next;
		}

		while (slow != null)
		{
			if (stack.pop() != slow.data)
			{
				return false;
			}
			slow = slow.next;
		}
		return true;

	}
}

class ListNode{
	int data;
	ListNode next;
	ListNode(int x) { this.data = x;}
	
	
}

