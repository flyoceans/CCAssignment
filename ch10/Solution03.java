
public class Solution03 {
	public static int search(int[] a, int x) {
		if (a == null || a.length == 0) {
			return -1;
		}
		int left = 0;
		int right = a.length-1;
		return searchRArray(a, x, left, right);
	}

	public static int searchRArray(int[] a, int x, int left, int right) {
		if (left > right)
			return -1;

		int mid = (left + right) / 2;
		if (x == a[mid]) {
			return mid;
		}
		if (a[left] < a[mid]) {
			if (x <= a[mid] && x > a[left]) {
				return searchRArray(a, x, left, mid - 1);
			} else {
				return searchRArray(a, x, mid + 1, right);
			}
		}
		else if (a[left] > a[mid]) {
			if (x <= a[right] && x > a[mid]) {
				return searchRArray(a, x, mid + 1, right);
			} else {
				return searchRArray(a, x, left, mid - 1);
			}
		}
		else {
			if (a[right] != a[mid]) {
				return searchRArray(a, x, mid + 1, right);
			} else {
				int result = searchRArray(a, x, left, mid - 1);
				if (result == -1)
					return searchRArray(a, x, mid + 1, right);
				else
					return result;
			}
		}

		//return -1;
	}
	
	public static void main(String[] args) {
		int[] test = {10, 15, 20, 0, 5};
		System.out.println(search(test, 5));
		System.out.println(test[1]);
	}
}
