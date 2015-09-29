import java.util.Arrays;
import java.util.Comparator;

public class Solution02 {
	public static void groupAna(String[] s) {
		Arrays.sort(s, new strComparator());
	}
	
	private static class strComparator implements Comparator<String> {
		public int compare(String s1, String s2) {
			return sortChar(s1).compareTo(sortChar(s2));
		}
		
		String sortChar(String s) {
			char[] array = s.toCharArray();
			Arrays.sort(array);
			return new String(array);
		}
	}
	
	public static void main(String[] args)
	{
		String[] s = {"abc", "def", "cba", "Carnegie", "Mellon", "bac"};
		groupAna(s);
		for (String elements: s) {
			System.out.println(elements);
		}
	}
}
