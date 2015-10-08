
public class Solution01 {
	public static int insertion(int N, int M, int j, int i) {
		//mask
		int mask = ~0;
		int left = (mask << j);
		int right = (1 << i) -1;
		mask = left | right;
		
		//clear bit j to bit i in M
		int newN = N & mask;
		
		//move to into correct position
		int newM = M << i;
		
		return newN | newM;
	}
	
	public static void main(String[] args) {
		int N = 1024;
		int M = 19;
		int j = 6;
		int i = 2;
		System.out.println(insertion(N, M, j, i));
		
	}
}
