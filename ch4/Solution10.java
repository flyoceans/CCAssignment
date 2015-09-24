public class Solution10 {
    public boolean checkSubtree(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) 
        	return false;
        if (isEqual(t1, t2)) 
        	return true;
        return checkSubtree(t1.left, t2) || checkSubtree(t1.right, t2);
    }

    public boolean isEqual(TreeNode t1, TreeNode t2){
    	if (t1 == null || t2 == null)
    		return false;
    	if (t1.val != t2.val)
    		return false;
    		
    	return isEqual(t1.left, t2.left) && isEqual(t1.right, t2.right);		
    }
    
    class TreeNode{
    	TreeNode left, right;
    	int val;
    	TreeNode(int x){
    		this.val = x;
    	}
    }
}