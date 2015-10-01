/*
 * This code was improved after reading the solution in the book.
 */

public class Solution10 {
	TreeNode root = null;

	void track(int x) {
		if (root == null) {
			root = new TreeNode(x);
		} else {
			root.insert(x);
		}
	}

	int getRankOfNumber(int x) {
		return root.getRank(x);
	}
}

class TreeNode {
	TreeNode left, right;
	int val;

	TreeNode(int x) {
		this.val = x;
	}

	int leftsize = 0;	//Use leftsize to store number of nodes of leftchild, thus we could get the rank.

	void insert(int x) {
		if (x <= val) {
			if (left == null) {
				left = new TreeNode(x);
			} else {
				left.insert(x);
			}
			leftsize++;
		} else {
			if (right == null) {
				right = new TreeNode(x);
			} else {
				right.insert(x);
			}
		}
	}

	int getRank(int x) {
		if (x == val) {
			return leftsize - 1;
		} else if (x < val) {
			if (left == null) {
				return -1;
			} else
				return left.getRank(x);
		} else {
			if (right == null) {
				return leftsize + 1;
			} else
				return leftsize + 1 + right.getRank(x);
		}
	}
}