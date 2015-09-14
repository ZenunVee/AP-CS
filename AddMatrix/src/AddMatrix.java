
public class AddMatrix 
{

	public static void main(String[] args) 
	{
		int[][] matrix1 = {{1,3,1}, {1,0,0}};
		int[][] matrix2 = {{0,0,5}, {7,5,0}};
		int[][] sumMatrix = new int[2][3];
		
		for(int r = 0; r < matrix1.length; r++)
			for(int c = 0; c < matrix1[r].length; c++)
				sumMatrix[r][c] = matrix1[r][c] + matrix2[r][c];
		
		for(int r = 0; r < sumMatrix.length; r++)
			for(int c = 0; c < sumMatrix[r].length; c++)
				System.out.print(sumMatrix[r][c] + " ");
		}

}
