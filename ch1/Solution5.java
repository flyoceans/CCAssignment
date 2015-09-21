public class Solution5{
	public static boolean oneAway(String str1, String str2){
		if (str1.length() > str2.length())     //Let str1 always be the smaller one.
		{
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		//System.out.println(str1);


		if (str1.length() == str2.length())		//Check the replacement operation.
		{
			int tag = 0;
			for (int i = 0; i < str1.length(); i++)
			{
				if (str1.charAt(i)!= str2.charAt(i))
				{
					tag ++;
				}
			}
			if (tag == 1)
			{
				return true;
			} else {
				return false;
			}
		} 
		else if (str2.length() - str1.length()!= 1)		//If the difference between their lengths is 
		{												//larger than 1, we could indicata that they 
			return false;								//are zero edits.
		}

		int count = 0;
		for (int j = 0; j < str1.length(); j++)			//Check the insertion and removal.
		{

			if (str1.charAt(j)!= str2.charAt(count))
			{
				count++;
				if(str1.charAt(j)!= str2.charAt(count))
				{
					return false;
				}
			}
			count++;
			if (count > str1.length()+1)
			{
				//System.out.println(count);
				return false;
			}
		}
		return true;
	}

//test case
	
	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "pales";
		String str3 = "ple";
		String str4 = "bale";
		String str5 = "bae";

		System.out.println(oneAway(str1, str3));
		System.out.println(oneAway(str2, str1));
		System.out.println(oneAway(str1, str4));
		System.out.println(oneAway(str1, str5));
	}

}