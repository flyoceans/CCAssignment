public class Solution7{

	//We could do the rotation from outer layer to inner layers.
	public static int[][] rotate(int[][] matrix){
		int N = matrix.length;
		//System.out.println(N);

		for (int row = 0; row < N/2; row++)		//Obviously we only need to loop half of the layers.
		{
			int col = N-1-row;
			
			for (int i = row; i < N-1; i++)		//Swap the responding square.
			{
				int temp = matrix[row][i];
				matrix[row][i] = matrix[i][col];
				matrix[i][col] = matrix[col][N-1-i];
				matrix[col][N-1-i] = matrix[N-1-i][row];
				matrix[N-1-i][row] = temp;
			}
		}
		return matrix;
	}


// test case.
	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[1][1] = 3;
		matrix[1][0] = 4;

		System.out.println(matrix[1][1]);
		matrix = rotate(matrix);
		System.out.println(matrix[1][1]);
	}
}
