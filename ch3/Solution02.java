public class Solution2{
	class stackMin{
		int[] value = new int[1000];
		int[] minvalue = new int[1000];
		int topOfStack = -1;

		public void push(int x)
		{
			//if (isFull())
			
			topOfStack++;
			value[topOfStack] = x;
			
			if (topOfStack == 0)
			{
				minvalue[0] = value[0];
			}
			if (x < minvalue[topOfStack-1]) 
			{
				minvalue[topOfStack] = x;
			} else{
				minvalue[topOfStack] = minvalue[topOfStack-1];
			}

		}

		public int pop()
		{
			//if (isEmpty())
			int val = value[topOfStack];
			topOfStack--;
			return val;
		}

		public int min()
		{	
			return minvalue[topOfStack];

		}

	}
}