import java.util.Stack;

public class Solution04{
	class MyQueue{
		Stack<Object> stack1 = new Stack<>();
		Stack<Object> stack2 = new Stack<>();

		void add(Object item)
		{
			if (stack1.isEmpty())
			{
				while (!stack2.isEmpty())
				{
					stack1.push(stack2.pop());
				}
			}
			stack1.push(item);
		}

		Object remove()
		{
			if (!stack2.isEmpty())
			{
				return stack2.pop();
			}
			else
			{
				while (!stack1.isEmpty())
				{
					stack2.push(stack1.pop());
				}
				return stack2.pop();
			}
		}

		int size()
		{
			return stack1.size()+stack2.size();
		}
	}
}
