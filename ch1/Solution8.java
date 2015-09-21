public class Solution8{

	//This solution was enlightened by the book. We could bulid a boolean array to 
	//store the infos of 0.
	public static int[][] zeroMatrix(int[][] matrix){
		boolean row[] = new boolean[matrix.length];
		boolean col[] = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[0].length; j++)
			{
				if (matrix[i][j] == 0)
				{
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int x = 0; x < row.length; x++)
		{
			for (int y = 0; y < col.length; y++)
			{
				if (row[x]||col[y])		//Either row or column is true, matrix[row][col] sets 0.
				{
					matrix[x][y] = 0;
				}
			}
			
		}
		

		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][1] = 0;
		matrix[1][0] = 4;
		matrix = zeroMatrix(matrix);

		System.out.println(matrix[0][1]);
		System.out.println(matrix[1][0]);
	}
}