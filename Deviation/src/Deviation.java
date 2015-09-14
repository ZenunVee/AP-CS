import java.util.Scanner;

public class Deviation 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] MKFC1TC = {58,84,79,80,92,79,92,73,92,85,85,82,68,69,60,49,78,87,65,95,30,88,64,83,71,37,59,75,89,65,83,76,65,92};
		double MKFC1TC_2; 
		int sum = 0, sum_2 = 0; double avg, avg_2, devi;
		
		for(int index = 0; index < MKFC1TC.length; index++)
			sum += MKFC1TC[index];
		
		avg = (sum / MKFC1TC.length) * 1.0;
		
		for(int index = 0; index < MKFC1TC.length; index++)
		{
			MKFC1TC_2 = Math.pow(MKFC1TC[index] - avg , 2);
			sum_2 += MKFC1TC_2;
		}
		
		avg_2 = (sum_2 / MKFC1TC.length) * 1.0;
		
		devi = Math.sqrt(avg_2);
		
		System.out.println("Deviation is " + devi);
	}

}
