package multipyMatrix;



public class multiplyMatrix 

{
	public static void main(String[] args)
	{
		int[][] matrix = {{1,8,-3}, {4,-2,5}};
		int[][] sum = new int[2][3];
		
		for(int r = 0; r < matrix.length; r++)
			for(int c = 0; c < matrix[r].length; c++)
				sum[r][c] = matrix[r][c] * 2;
		
		for(int r = 0; r < matrix.length; r++)
			for(int c = 0; c < matrix[r].length; c++)
				System.out.print(sum[r][c] + " ");
			
	}
	

}
