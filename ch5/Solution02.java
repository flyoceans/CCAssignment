/*
 * According to the transformation from decimal number to binary number, we could multiply
 * decimal number by 2 every time, and each time we could get one binary number digit.
 */
public class Solution02 {
	public static String binaryToString(double num) {
		if (num >= 1|| num <= 0) {
			return "ERROR";
		}
		
		//Preprocessor StringBuilder
		StringBuilder binary = new StringBuilder();
		binary.append('0');
		binary.append(".");
		
		while(num > 0) {
			if (binary.length() > 32) {
				return "ERROR";
			}
			
			num = num*2;
			if (num - 1 > 0) {
				binary.append("1");
				num = num -1;
			} else if (num - 1 < 0) {
				binary.append("0");
			} else {
				binary.append("1");		//equal to 1 means rest of fraction is zero.
				break;
			}
		}
		return binary.toString();
	}
	
	public static void main(String[] args) {
		double num = 0.625;
		System.out.println(binaryToString(num));
	}
}
