/*
 * In order to get the real length of a, we assume that effective integer is not equal to zero.
 */
public class Solution012
{
	public static void sortedMerge(int[] a, int[] b) {
		if (a == null) {
			a = b;
		}
		
		int indexofa = 0;
		while (a[indexofa] != 0){
			indexofa ++;
		}
		indexofa --;
		//System.out.println(indexofa);
		
		int indexofb = b.length -1;
		int indexofmerge = indexofa + indexofb +1;
		while (indexofb >= 0) {
			if (indexofa >= 0 && a[indexofa] > b[indexofb]) {
				a[indexofmerge] = a[indexofa];
				indexofa--;
			} else {
				a[indexofmerge] = b[indexofb];
				indexofb--;
			}
			indexofmerge--;
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] a = new int[10];
		//System.out.println(a[8]);
		int[] b = {1, 3, 5, 7};
		for (int i = 0; i < 5; i++) {
			a[i] = (i+1)*2;
		}
		sortedMerge(a, b);
		for (int number: a) {
			System.out.println(number);
		}
	}
}
