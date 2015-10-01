import java.util.Arrays;

/*
 * Sort the array, and then exchange the location of one element with its previous one every two elements.
 */
public class Solution11 {
	public void peakValley(int[] a) {
		if ( a == null || a.length == 0) {
			return;
		}
		Arrays.sort(a);
		for (int i = 1; i < a.length; i+=2) {
			int tmp = a[i-1];
			a[i-1] = a[i];
			a[i] = tmp;
		}
	}
}
