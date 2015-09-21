/* If a string is a permutation of a palindrome, the number of its characters must be even with
	at most an odd character, so we just need to figure out that if it is an even count.
*/

public class Solution4{
	public static boolean palPer(String str){
		if (str == null|| str.length() == 0)
		{
			return false;
		}

		str = str.trim().toLowerCase();

		int[] count = new int[128];
		for (int i =0; i < str.length(); i++)  //Saving the characters' count.
		{
			count[str.charAt(i)]++;
		}

		int tag = 0;
		for (int j = 0; j < str.length(); j++)
		{
			if (count[str.charAt(j)]%2 !=0&& str.charAt(j) != ' ')  //check if it is an even count.
			{
				tag ++;
			}
			if(tag > 1)			// At most one odd.
			{
				return false;
			}
		}
		return true;
	}

// test case

	public static void main(String[] args) {
		String str = "Tact Coa";
		String str1 = "Carnegie Mellon";

		System.out.println(palPer(str));
		System.out.println(palPer(str1));
	}
}