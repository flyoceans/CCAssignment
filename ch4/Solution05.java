import java.util.ArrayList;

public class Solution05{
	public boolean isBST(TreeNode tree){
		ArrayList<Integer> list = new ArrayList<Integer>();
		inOrder(tree, list);

		for (int i = 1; i < list.size(); i++)
		{
			if (list.get(i) < list.get(i-1))
				return false;
		}
		return true;
	}

	public void inOrder(TreeNode tree, ArrayList<Integer> list){
		if (tree == null) return;
		inOrder(tree.left, list);
		list.add(tree.val);
		inOrder(tree.right, list);
	}

	class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode (int x)
		{
			this.val = x;
		}
	}
}