public class Solution6{
	public static String strCompression(String str){
		StringBuffer compstr = new StringBuffer();
		
		int count = 1;
		char tag = str.charAt(0);
		for (int i = 1; i < str.length(); i++)		//For each iteration, if character is the same, 
		{											//counting the repeats. If not, turn to next one.
			if (str.charAt(i) == tag)
			{
				count++;
			}
			else{
				compstr.append(tag);
				compstr.append(count);
				tag = str.charAt(i);
				count = 1;
			}
		}
		compstr.append(tag);
		compstr.append(count);

		return compstr.length() < str.length() ? compstr.toString() : str;		//Improved this line after
																				//reading the book solution.

	}

//test case

	public static void main(String[] args) {
		String str = "aabcccccaaa";
		System.out.println(strCompression(str));
	}
}