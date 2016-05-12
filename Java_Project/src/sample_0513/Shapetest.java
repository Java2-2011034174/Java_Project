package sample_0513;

public class Shapetest {

	public static void main(String[] args)
	{
		//Shape s1 = new Shape();
		Rec r1 = new Rec();
		Cir c1 = new Cir();
	
		//s1.move(99, 99);
		r1.move(157, 157);	
		c1.move(3, 3);
		infor(r1);
		infor(c1);
		
		r1.info();
}
	static void infor(Shape ro)
	{
		ro.info();
		ro.iii();
	} // 이걸 쓰면 다형성이 활용된다. 부모 클래스를 이용해 자식 클래스가 다 된다. 단 이걸 쓸려면 메소드 오버라이딩이 필요하다.
	/*static void inforrr(Rec r)
	{
		r.info();
	} */ // 자식이 30개면 메소드 30개 필요하게 됨. 이방식으로 하면
	
	/*static void infor(Cir c)
	{
		c.info();
	}*/
	}

	//다형성을 쓰는 이유 ! : 왜?? 가장 쉬운 이유는, 뭔가 규모가 늘거나 종류가 늘었을 때, 그냥 밑의 (Rec r - 24열)같은 거를 쓰면 변경되면 하나하나 수정/추가를 해야한다. 하나의 클래스 이름을 가지고 밑에 
//예속되는 자식을 다 쓸 수 있다

