public class Solution08{
	public TreeNode firstComAnc(TreeNode root, TreeNode n1, TreeNode n2){
		
		if (root == null)
			return null;
		if (n1 == root || n2 == root)
			return root;

		if (dfs(root.left, n1) && dfs(root.left, n2))
			return firstComAnc(root.left, n1, n2);
		else if (dfs(root.right, n1) && dfs(root.right, n2))
			return firstComAnc(root.right, n1, n2);
		else
			return root;
	}

	public boolean dfs(TreeNode root, TreeNode n){
		if (root == null)
			return false;
		if (root == n)
			return true;

		return dfs(root.left, n)||dfs(root.right, n);

	}

	class TreeNode{
		TreeNode left, right;
		int val; 
		TreeNode (int x){
			this.val = x;
		}
	}

}