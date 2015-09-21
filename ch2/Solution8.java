 public class Solution8{

 // we still use the runner technique, and faster point's speed is twice than the slower one.
 // So if we assume that when slow reach the beginning of the loop, say k steps, then fast have
 // run k steps in the circle. When both of them start to run in the circle, they would meet eventually,
 // and we know that because the relative spead of them is one unit speed of slow. So when meet in 
 // the circle, the slow one must run (Loopsize-k) steps,(we assume loopsize is much more than k here).
 	public ListNode loopDetection(ListNode n){
 		ListNode fast = n;
 		ListNode slow = n;
 		fast = fast.next.next;
 		slow = slow.next;

 		while(fast != slow)
 		{
 			fast = fast.next.next;
 			slow = slow.next;
 		}

 		ListNode pointer = n;
 		while(n != slow)
 		{
 			n = n.next;
 			slow = slow.next;
 		}

 		return pointer;

 	}
 	 

}

class ListNode{
	int data;
	ListNode next;
	ListNode(int val)
	{
		this.data = val;
	}
}