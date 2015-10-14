import java.util.Stack;

public class Solution05{
	public Stack sortStack(Stack<Integer> stack){
		Stack<Integer> tmpstack = new Stack<>();

		if (stack.isEmpty)
			return stack;

		while (!stack.isEmpty()) {
			int tmp = stack.pop();
			
			while (!tmpstack.isEmpty() && tmpstack.peek() < tmp) {
				stack.push(tmpstack.pop());
			}
			tmpstack.push(tmp);
		}

		return tmpstack;
	}
}