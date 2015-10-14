public class Solution2{
	/*
	 * Using an extra stack to store and record the min element.
	 * Every time we push a new element, we could compare it with the top element of 
	 * minvalue[] and then push the corresponding element into minvalue[].
	 */
	class stackMin{
		int[] value = new int[1000];
		int[] minvalue = new int[1000];
		int topOfStack = -1;

		public void push(int x) throws Exception
		{
			if (this.isFull()) {
				throw new Exception();
			}
			
			topOfStack++;
			value[topOfStack] = x;
			
			if (topOfStack == 0)
			{
				minvalue[0] = value[0];
			}
			else if (x < minvalue[topOfStack-1]) 
			{
				minvalue[topOfStack] = x;
			} else{
				minvalue[topOfStack] = minvalue[topOfStack-1];
			}

		}

		public int pop() throws Exception
		{
			if (isEmpty()) {
				throw new Exception();
			}
			int val = value[topOfStack];
			topOfStack--;
			return val;
		}

		public int min()
		{	
			return minvalue[topOfStack];
		}

		public boolean isFull()
		{
			return topOfStack == 999;
		}

		public boolean isEmpty()
		{
			return topOfStack == -1;
		}

	}
}