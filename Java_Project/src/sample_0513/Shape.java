package sample_0513;

abstract public class Shape {
	protected int x, y;
	
	public Shape()
	{
		x = 0;
		y = 0;
		
	}//인자가 없는 걸 일부러 넣어준다. 오버라이딩이랑 오버로딩 때문에
	
	public Shape(int _x, int _y)
	{
		x = _x; 
		this.y = _y;
	}
	
	abstract public void move(int _x, int _y);/* 그냥 연결만을 위한 것.  
	{
		this.x +=_x;
		y+=_y;
	}//왜 x 와 this.x로 나눴지? */
	
	abstract public void info();
	abstract public void iii();


}
