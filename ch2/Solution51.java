public class Solution51{
	
//		We could iterate through the linked list and figure out their integer numbers 
//		as num1 and num2.
//		Adding num1 and num2 as num, which is a integer, and then we store each digits of num 
//		in a new linked list.	
	public static ListNode sumList(ListNode n1, ListNode n2){
		ListNode node = n1;
		int num1 = 0;
		int num2 = 0;
		int times = 1;
		while(n1 != null)
		{
			num1 = (n1.data)*times + num1;
			times = times*10;
			n1 = n1.next;
		}
		times = 1;
		while(n2 != null)
		{
			num2 = (n2.data)*times + num2;
			times = times*10;
			n2 = n2.next;
		}

//		Setting two pointers, nodehead the slow one and node the fast one. 
		int num = num1 + num2;
		ListNode nodehead = new ListNode(num%10);
		nodehead.next = node;
		num = num/10;
		while(num != 0)
		{
			node.data = num%10;
			num = num/10;
			node.next = node;
		}
		return nodehead;
	}

// 		test case.
	public static void main(String[] args) {
		ListNode n1 = new ListNode(7);
		ListNode n2 = new ListNode(1);
		ListNode n3 = new ListNode(5);
		ListNode n4 = new ListNode(9);

		n2 = n1.next;
		n4 = n3.next;

		System.out.println(sumList(n1, n3).data);
	}
}

class ListNode{
		int data;
		ListNode next;
		ListNode(int x) { data = x;}
	}
