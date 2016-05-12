package sample_0512;

public class Animal 
	{
	
	
	protected double weight;
	protected String picture;
	
	public Animal() //생성자
	{
		weight = 100; picture = "animal";
		System.out.println("animal count");
	}
	
	
	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("animal Cont22 count");

	}
//단순히 돌릴때(자동호출), 인자가 아무것도 없는거만 돌린다(위의 ainimal())
//그렇다면 밑에  걸 돌리려면?
//Lion에서 인자를 넣어봐라!
	void eat()
	{ 
		System.out.println("eat()가 호출 되었음");
	}
	void sleep()
	{
		
			System.out.println("sleep()가 호출되었음");
	}
}
