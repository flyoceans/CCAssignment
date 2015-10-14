public class Solution06{

/**
 *The main idea of this code was cited from Hongyi Shi.
 */
	TreeNode next = null;
	TreeNode tmp = null;

	public TreeNode successor(TreeNode root, TreeNode n){
		dfs(root,n);
		return next;
	}

	public void dfs(TreeNode root, TreeNode n){
		if (root == null)
			return;

		dfs(root.left, n);
		if (tmp == n) 
			next = root;
		tmp = root;
		dfs(root.right, n);
	}

	class TreeNode{
		TreeNode left, right;
		int val;
		TreeNode(int x){
			this.val = x;
		}
	}

}