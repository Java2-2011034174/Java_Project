package sample_0513;

public class Cir extends Shape{

	private int r;
	
	public Cir()//�̰� ������ x1,y1�� �ʱ�ȭ�� �ȵȴ�
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
