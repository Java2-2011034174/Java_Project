package sample_0513;

public class Cir extends Shape{

	private int r;
	
	public Cir()//이게 없으면 x1,y1이 초기화가 안된다
	{
		r = 23;
	}
	
	public void move(int _x, int _y)
	{
		x = _x+r;
		y = _y+r;
	}
	public void info() 
	{
		System.out.println("x : "+x +" y : "+y);
	}
	public void iii() 
	{
		System.out.println(r);
	}
	
}
