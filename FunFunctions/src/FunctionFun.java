
public class FunctionFun 
{

	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
		System.out.println(permutation(15,4));
		
	}
	
	public static int factorial(int factorial)
	{
		int totalFactorial = 1;
		for(int x = 1; x <= factorial; x++)
			totalFactorial *= x;
		
		return totalFactorial;
	}
	
	public static long permutation(int n, int r)
	{
		return factorial(n) / factorial(n-r);
	}
	
}
