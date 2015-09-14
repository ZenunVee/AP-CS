import java.awt.Color;

public class Ball 
{
	private int x,y,r,dx,dy;
	private Color color;
	private double speed, theta;
	
	public Ball()
	{
		
	}
	
	public Ball(int radius)
	{
		r = radius;
	}
	
	public Ball(int xCord, int yCord, int radius)
	{
		x = xCord; y = yCord; r = radius;
	}
	
	public void Move(boolean move)
	{
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getTheta() {
		return theta;
	}

	public void setTheta(double theta) {
		this.theta = theta;
	}
	 public String toString()
	 {
		 return "Radius :" + r;
	 }
	
	
	
}
