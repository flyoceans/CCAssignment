import java.util.ArrayList;
import java.util.LinkedList;

public class Solution03{
	public ArrayList<LinkedList<TreeNode>> listOfDep(TreeNode tree){
		ArrayList<LinkedList<TreeNode>> array = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> lists = new LinkedList<TreeNode>();
		lists.add(tree);
		//array.add(lists);

		while(lists.size() > 0)
		{
			array.add(lists);
			LinkedList<TreeNode> parent = lists;
			lists = new LinkedList<TreeNode>();

/*
 *This was revised after reading the solution in our book.	
 */		
			for (TreeNode parents : parent)	
			{
				if (parents.left != null)
				{
					lists.add(parents.left);
				}
				if (parents.right != null)
				{
					lists.add(parents.right);
				}
			}
			
			
		}
		return array;
	}

	class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(int x)
		{
			this.val = x;
		}
	}

}