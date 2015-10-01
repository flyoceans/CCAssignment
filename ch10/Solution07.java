import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Part of this code was cited from book's solution, and I will update my own algorithm in the future.
 */

public class Solution07 {
	private static long numberOfInts = ((long)Integer.MAX_VALUE)+1;
	private static byte[] bitSet = new byte[(int)(numberOfInts / 8)];
	
	public void findOpenNumber(String filename) throws FileNotFoundException {
		Scanner in = new Scanner(new FileReader(filename));
		while(in.hasNextInt()) {
			int n = in.nextInt();
			bitSet [n / 8] |= 1 << (n % 8); 
		}
		
		for(int i=0;i<bitSet.length;i++) {
			for(int j=0;j<8;j++) {
				if((bitSet[i] & (1<<j)) == 0) {
					System.out.println(i*8+j);
					return;
				}
			}
		}
	}
}