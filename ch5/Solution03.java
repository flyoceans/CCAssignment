/*
 * Brute force.
 */
public class Solution03 {
	public static int flipToWin(int num) {
		int longestSeq = 0;
		 for (int i = 0; i < 32; i++) {
			 longestSeq = Math.max(longestSeq, longest1s(num, i));
		 }
		 
		 return longestSeq;
	}
	
	static boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0);
	}
	
	static int longest1s(int num, int flip) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (i == flip || getBit(num, i)) {
				count++;
				max = Math.max(count, max);
			} else {
				count = 0;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int num = 1775;
		System.out.println(flipToWin(num));
	}
	
}
