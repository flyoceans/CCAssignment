import java.util.HashMap;

/*
 ** The idea of this algorithm was provided by Hongyi's solution.
 */
public class Solution12 {

    HashMap<Integer, Integer> cnt = new HashMap<>();
    int paths = 0;
    
    public int pathsWithSum(TreeNode n, int value) {
        dfs(n, 0, value);
        return paths;
    }

    void dfs(TreeNode n, int sum, int value) {
        if (n == null) 
        	return;
        
        int s = sum + n.val;
        if (cnt.containsKey(s - value))
        {
            paths = paths + cnt.get(s - value);
        }
        if (cnt.containsKey(s)) {
        	cnt.put(s, cnt.get(s) + 1);
        }
        else {
        	cnt.put(s, 1);
        }
        
        dfs(n.left, s, value);
        dfs(n.right, s, value);
        
        int t = cnt.get(s) - 1;
        if (t == 0) 
        	cnt.remove(s);
        else 
        	cnt.put(s, t);
    }

    class TreeNode {
        
        TreeNode left, right;
        int val;
        TreeNode(int val) {
            this.val = val;
        }
    }

}