
public class driverClass 
{

	public static void main(String[] args) 
	{
		Ball myBall = new Ball(8,8,3);
		Ball myBall2 = new Ball(3);
		
		p(myBall);
	}
	
	public static void p(Object o)
	{
		System.out.println(o);
	}
}
