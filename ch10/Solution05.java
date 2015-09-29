
public class Solution05 {
	public static int sparseSearch(String x, String[] a) {
		if (a == null || a.length == 0 || x == null) {
			return -1;
		}
		int length = a.length;
		return binarySearch(x, a, 0, length - 1);
	}

	private static int binarySearch(String x, String[] a, int l, int r) {
		if (l > r) {
			return -10;
		}
		int mid = (l + r) / 2;
		
		int left = mid -1;
		int right = mid +1;
		if (a[mid] == "") {
			while (a[left] == ""&&left > l) {
				left--;
			}
			if (left != l) {
				mid = left;
			} else {
				while (a[right] == ""&& right < r) {
					right++;
				}
				if (right != l) {
					mid = right;
				} else {
					return -1;
				}
			}
		}

		if (a[mid] == x) {
			return mid;
		} else if (a[mid].compareTo(x) < 0) {
			return binarySearch(x, a, mid + 1, r);
		} else {
			return binarySearch(x, a, l, mid - 1);
		}
	}

	public static void main(String[] args) {
		String[] test = { "", "abc", "bcd", "", "", "", "cdf", "", "", "hello", ""};
		System.out.println(sparseSearch("cdf", test));
	}
}
