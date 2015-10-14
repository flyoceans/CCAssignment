import java.util.ArrayList;
import java.util.Stack;

public class Solution03{
	class SetOfStacks{
		ArrayList<Stack<Object>> Arrays = new ArrayList<>();
		private int tag = -1;
		private int size;
	
		public void push(Object obj)
		{
			if (tag < 0 || Arrays.get(tag).size() == size)
			{
				Arrays.add(new Stack<Object>());
				tag++;
			}
			Arrays.get(tag).push(obj);
		}

		public Object pop() throws Exception
		{
			if (tag < 0) throw new Exception();
			if (Arrays.get(tag).isEmpty())
			{
				Arrays.remove(tag);
				tag--;
			}
			return Arrays.get(tag).pop();
		}

		public Object popAt(int index)
		{
			return Arrays.get(index).pop();
		}
		
		public void setSize(int size)
		{
			this.size = size;
		}
	}
}