public class Solution04{
	public boolean checkBalanced(TreeNode root){
		if (root == null)
			return true;

		int reminder = Math.abs(getHeight(root.left) - getHeight(root.right));
		if (reminder > 1)
			return false;
		else
		{
			return checkBalanced(root.left)&&checkBalanced(root.right);	
		}
			
	}

	public int getHeight(TreeNode root){
		if (root == null)
			return -1;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
}

class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int x){
		this.val= x;
	}
}