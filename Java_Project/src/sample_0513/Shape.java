package sample_0513;

abstract public class Shape {
	protected int x, y;
	
	public Shape()
	{
		x = 0;
		y = 0;
		
	}//���ڰ� ���� �� �Ϻη� �־��ش�. �������̵��̶� �����ε� ������
	
	public Shape(int _x, int _y)
	{
		x = _x; 
		this.y = _y;
	}
	
	abstract public void move(int _x, int _y);/* �׳� ���Ḹ�� ���� ��.  
	{
		this.x +=_x;
		y+=_y;
	}//�� x �� this.x�� ������? */
	
	abstract public void info();
	abstract public void iii();


}
