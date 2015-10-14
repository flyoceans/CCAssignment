import java.util.EmptyStackException;

//This code was discussed with Jiang Yi and impoved by our coding bootcamp book.
public class Solution1{
	class threeOneStack{

		int stackSize;
		int[] value;
		int[] sizes;

		threeOneStack(int[] array)
		{
			stackSize = array.length / 3;
			sizes = new int[3];
			value = new int[array.length];
		}

		public void push(int stacknum, int val) throws Exception
		{
			if (isFull(stacknum))
			{
				throw new Exception();
			}
			sizes[stacknum]++;
			value[indexOfTop(stacknum)] = val;
		}

		public int pop(int stacknum)
		{
			if (isEmpty(stacknum))
			{
				throw new EmptyStackException();
			}
			int val = value[indexOfTop(stacknum)];
			// value[stackSize*stacknum + indexOfTop(stacknum)] = 0;
			sizes[stacknum]--;
			return val;
		}

		public int peek(int stacknum)
		{
			if (isEmpty(stacknum))
			{
				throw new EmptyStackException();
			}
			return value[indexOfTop(stacknum)];
		}

		public boolean isEmpty(int stacknum)
		{
			return sizes[stacknum] == 0;
		}

		public boolean isFull(int stacknum)
		{
			return sizes[stacknum] == stackSize;
		}

		private int indexOfTop(int stacknum)
		{
			int size = sizes[stacknum];
			int offset = stacknum * stackSize;
			return offset + size - 1;
		}
	}

}
