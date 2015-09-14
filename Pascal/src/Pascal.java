
public class Pascal 
{

	public static void main(String[] args) 
	{
		int[][] pascalTriangle = new int[10][10];
		pascalTriangle[0][0] = 1;
		pascalTriangle[1][0] = 1;
		pascalTriangle[1][1] = 1;
		
		for(int r = 2; r < pascalTriangle.length ; r++)
		{
			for(int num = 1; num < r + 1; num++)
			{
				if(num == 1)
					pascalTriangle[r][0] = 1;
				
				pascalTriangle[r][num] = pascalTriangle[r-1][num] + pascalTriangle[r-1][num-1];
				
				if(num == r - 1
					pascalTriangle[r][num ] = 1;
				
				System.out.print(pascalTriangle[r][num-1]);
				System.out.print(" ");
				
			}
			System.out.println(" ");
		}
	}

}
