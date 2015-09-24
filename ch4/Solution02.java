public class Solution02{
	public TreeNode minimalTree(int[] sorted){
		return minimalTree(sorted, 0, sorted.length-1);
	}

	public TreeNode minimalTree(int[] sorted, int l, int r){
		
		if (l > r) return null;

		int m = (l + r)/2;
		TreeNode tree = new TreeNode(sorted[m]);
		tree.left = minimalTree(sorted, l, m-1);
		tree.right = minimalTree(sorted, m+1, r);

		return tree;
	}

	class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(int x){
			this.val = x;
		}
	}
}