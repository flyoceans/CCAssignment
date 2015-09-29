
public class Solution04 {
	public int search(int[] a, int x){
		if (a == null) {
			return -1;
		}
		int length = getSize(a, x);
		if (length == 0)
			return -1;
		
		return binarySearch(a, x, length/2, length);
	}
	
	private int getSize(int[] a, int x){
		int i = 1;
		while (a[i] != -1&&a[i] < x) {
			i = i*2;
		}
		return i;
	}
	
	private int binarySearch(int[] a, int x, int l, int r) {
		if (l > r) {
			return -1;
		}
		int mid = (l + r)/2;
		if (a[mid] == x)
			return mid;
		if (a[mid] > x || a[mid] == -1) {
			return binarySearch(a, x, l, mid-1);
		} else {
			return binarySearch(a, x, mid+1, r);
		}
	}
	
}
