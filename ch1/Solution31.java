/* Actually we could consider this problem as movement operation of array.
	We could mark the amounts of space, and then let the characters behind the space move two digits,
	so the new array's length would be our output one.
	*/

public class Solution31{
	public static char[] urLify(char[] cha, int length){
		int count = 0;
		for (int i = 0; i < length; i++)
		{
			if (cha[i] == ' ')
			{
				count++;
			}
		}

		int length1 = count*2 + length;

		for (int j = length-1; j >= 0 ; j--)
		{
			if (cha[j] != ' ')
			{
				cha[length1-1] = cha[j];
				length1--;
			}
			else if (cha[j] == ' ')
			{
				cha[length1-1] = '0';
				cha[length1-2] = '2';
				cha[length1-3] = '%';
				length1 = length1-3;
			}
		}
		return cha;
	}

// test case

	public static void main(String[] args) {
		char[] cha = {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', 
						' ', ' ', ' ', ' ', ' '};
		System.out.println(urLify(cha, 13));
	}


}
