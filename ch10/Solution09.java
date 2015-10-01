
/*
 * Firstly, we traverse the row, and then traverse the column to find x.
 */
public class Solution09 {
	public static void smSearch(int[][] a, int x) {
		if (a == null || a.length == 0) {
			return;
		}
		
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i][0];
		}
		int row = binarySearch(b, x, 0, a.length-1);
		int column = binarySearch2(a[row], x, 0, a[row].length-1);
		if (column > 0) {
			System.out.println(row + "," + column);
		} else 
			System.out.println("not exist");
		
	}
	
	static int binarySearch(int[] b, int x, int l, int r) {
		if (l > r) {
			return -1;
		}
		
		int mid = (l + r)/2;
		if (b[mid] == x) {
			return mid;
		}
		else if (b[mid] < x) {
			if (mid+1 == b.length) {
				return mid;
			}
			else if (mid+1 <= b.length && b[mid+1] > x) {
				return mid;
			} else
			return binarySearch(b, x, mid+1, r);
		}
		else { //b[mid]>x
			if (mid-1 == 0) {
				return mid-1;
			}
			else if (mid-1 >= 0 && b[mid-1] < x) {
				return mid-1;
			} else
			return binarySearch(b, x, l, mid-1);
		}
	}
	
	static int binarySearch2(int[] c, int x, int l, int r) {
		if (l > r) {
			return -1;
		}
		
		int mid = (l+r)/2;
		if(c[mid] == x) {
			return mid;
		} else if (c[mid] < x) {
			return binarySearch2(c, x, mid+1, r);
		} else {
			return binarySearch2(c, x, l, mid-1);
		}
	}
	
	public static void main(String[] args) {
		int[][] a = new int[3][2];
		a[0][0] = 1;
		a[0][1] = 3;
		a[1][0] = 5;
		a[1][1] = 7;
		a[2][0] = 9;
		a[2][1] = 11;
		
		smSearch(a, 10);
		smSearch(a, 7);
		
	}
}
