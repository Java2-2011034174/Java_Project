package sample_0512;

public class Eagle extends Animal
{
	private int Wings =2;
	
	public Eagle()
	{
		System.out.println("Eagle count");

		
	}
	void fly()
	{
		System.out.println("fly()호출됨");
	}
	
	void eat()
	{ 
		System.out.println("Eagle EAT()가  호출 되었음");
	}
}
