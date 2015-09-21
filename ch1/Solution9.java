public class Solution9{
	public boolean strRotation(String str1, String str2){
		if (str1.length() != str2.length())
		{
			return false;
		}

		String str1str1 = str1 + str2;
		if (isSubstring(str1str1, str2))
		{
			return true;
		}
		return false;
	}
}