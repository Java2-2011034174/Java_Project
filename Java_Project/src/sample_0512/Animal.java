package sample_0512;

public class Animal 
	{
	
	
	protected double weight;
	protected String picture;
	
	public Animal() //������
	{
		weight = 100; picture = "animal";
		System.out.println("animal count");
	}
	
	
	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("animal Cont22 count");

	}
//�ܼ��� ������(�ڵ�ȣ��), ���ڰ� �ƹ��͵� ���°Ÿ� ������(���� ainimal())
//�׷��ٸ� �ؿ�  �� ��������?
//Lion���� ���ڸ� �־����!
	void eat()
	{ 
		System.out.println("eat()�� ȣ�� �Ǿ���");
	}
	void sleep()
	{
		
			System.out.println("sleep()�� ȣ��Ǿ���");
	}
}
