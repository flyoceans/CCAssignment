public class Solution2{
	public static boolean checkPerm(String str1, String str2){
		if(str1.length() != str2.length())
		{
			return false;
		}

		int[] count = new int[128]; // we simplify the problem and assume the string is an ASCII.

		for (int i = 0; i < str1.length(); i++)
		{
			count[(int)str1.charAt(i)]++;	//counting the times that each char in str1 appears.
		}

		for (int j = 0; j < str1.length(); j++)
		{
			count[(int)str2.charAt(j)]--;
			
			if(count[(int)str2.charAt(j)] < 0)	//compare str1 and str2.
			{
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		String str1 = "bootcamp=11601";
		String str2 = "11601=campboot";
		String str3 = "bootcampis11601";

		System.out.println(checkPerm(str1, str2));

		System.out.println(checkPerm(str3, str2));
		
	}
}
