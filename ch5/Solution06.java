public class Solution06 {
     public static int bitNeeded(int A, int B) {
    	 int count = 0;
    	 //Check every bit of C to see if it equals 1
    	 for (int C = A ^ B; C != 0; C = C & (C-1)) {
    		 count ++;  
    	 }
    	 return count;
     }
     public static void main(String[] args) {
    	 int A = 29, B = 15;
    	 System.out.println(bitNeeded(A, B));
     }
}
