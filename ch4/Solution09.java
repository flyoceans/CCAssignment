import java.lang.Integer;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * I could not solve this problem until read our book, so part of this code was copied from
 * our book's solution. (Cracking the Coding Interview, 6th edition)
 */

    public class Solution09{
    	public static ArrayList<LinkedList<Integer>> bstSequence(TreeNode node){
    		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();

    		if (node == null){
    			result.add(new LinkedList<Integer>());
    			return result;
    		}

    		LinkedList<Integer> prefix = new LinkedList<Integer>();
    		prefix.add(node.val);

    		ArrayList<LinkedList<Integer>> lefts= bstSequence(node.left);
    		ArrayList<LinkedList<Integer>> rights = bstSequence(node.right);

    		for (LinkedList<Integer> left : lefts){
    			for (LinkedList<Integer> right : rights){
    				ArrayList<LinkedList<Integer>> sorted = new ArrayList<LinkedList<Integer>>();
    				sortedlist(left, right, sorted, prefix);
    				result.addAll(sorted);
    			}
    		}

    		return result;
    	}

    	public static void sortedlist(LinkedList<Integer> left, LinkedList<Integer> right, 
    		ArrayList<LinkedList<Integer>> sorted, LinkedList<Integer> prefix){
    		if (left.size() == 0 || right.size() == 0){
    			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
    			result.addAll(left);
    			result.addAll(right);
    			sorted.add(result);
    			return;
    		}

    		int leftfirst = left.removeFirst();
    		prefix.addLast(leftfirst);
    		sortedlist(left, right, sorted, prefix);
    		prefix.removeLast();
    		right.addFirst(leftfirst);

    		int rightfirst = right.removeFirst();
    		prefix.addLast(rightfirst);
    		sortedlist(left, right, sorted, prefix);
    		prefix.removeLast();
    		right.addFirst(rightfirst);

    	}

    	public static class TreeNode{
    		TreeNode left, right;
    		int val;
    		TreeNode(int x)
    		{
    			this.val = x;
    		}
    	}
    	
    	 public static void main(String[] args){
    	        TreeNode n = createBST();
    	        ArrayList<LinkedList<Integer>> result = bstSequence(n);
    	        for (LinkedList<Integer> row : result){
    	                System.out.println(row);
    	            }
    	    }
    	    
    	    public static TreeNode createBST(){
    	        TreeNode n = new TreeNode(2);
    	        n.left = new TreeNode(1);
    	        n.right = new TreeNode(3);
    	        return n;

    }
}