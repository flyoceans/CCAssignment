public class Solution1 {
	public static boolean isUnique (String s){

		boolean[] array = new boolean[128];//Assuming that the string is an ASCII. Contributed by
		  								   //book's solution. 
		if(s.length() > 128)
		{
			return false;
		}

		for (int i = 0; i < s.length(); i ++ ) 
		{
			
			if (array[(int)s.charAt(i)] == true)
			{
				return false;
			}
			array[(int)s.charAt(i)] = true;
		}
		return true;
	}

// test
	public static void main(String[] args)
	{
		String test1 = "sd12+-!@";
		String test2 = "asda";

		System.out.println(isUnique(test1));
		System.out.println(isUnique(test2));

	}



}