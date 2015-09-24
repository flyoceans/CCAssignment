import java.util.Stack;

public class Solution05{
	public Stack sortStack(Stack<Integer> stack){
		Stack<Integer> tmpstack = new Stack<>();

		while(!stack.isEmpty())
		{
			int tmp = stack.pop();
			while (!tmpstack.isEmpty())
			{
				if (tmpstack.peek() < tmp)
				{
					stack.push(tmpstack.pop());
				}
				else
				{
					tmpstack.push(tmp);
					break;
				}
			}
			if (tmpstack.isEmpty())
			{
				tmpstack.push(tmp);
			}
		}	
		return tmpstack;
	}
}