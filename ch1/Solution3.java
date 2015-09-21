public class Solution3{
	public static String urLify(String str, int length){
		String[] word = new String[length];

		int count = 0;
		for (int i = 0; i < length; i++)
		{
			if (str.charAt(i) != ' ')
			{
				word[count] = word[count] + str.charAt(i);
			}
		//	else if (str.charAt(i) = '  ')
		//	{
		//		break;
		//	}
			else if (str.charAt(i) == ' ')
			{
				count++;
			}
		}

		String s = "";
		for (int j = 0; j < count; j++)
		{
			s = word[j] + "%20";
		}

		s = s + word[count];

		return s;
	}

	public static void main(String[] args) {
		String str = "Mr John Smith     ";
		//int length = 13;
		System.out.println(urLify(str, 13));

	}
}