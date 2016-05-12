package sample_0513;

public class Rec extends Shape {

	private int x1,y1;
	
	public Rec()//이게 없으면 x1,y1이 초기화가 안 된다
	{
		x1 = 5;
		y1 = 7;
	}
	
	public void move(int _x, int _y)
	{
		x = x1+_x;
		y = y1+_y;
	}
	public void info() 
	{
		System.out.println("x : "+x +" y : "+y);
	}
	public void iii() 
	{
		System.out.println(x+" "+y);
	}
	
}
