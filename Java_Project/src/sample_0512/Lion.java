package sample_0512;

public class Lion extends Animal
{
	private int legs;
	
	public Lion() {
		super(100 ,"KING");//�̰� �� ������? �ڵ����� �Ǵµ� - Animal ���� �����ڰ� ������ ���� ��, Ư���� ���� ���� �� �ְ� �Ǿ���. ���� ���� Aniaml�� ���� ���� ���ư����� �� �� ���� ���̴�.
		this.legs =4;
	}
	//Source�� generate constructor using filed ���
	void roar()
	{
		System.out.println("roar()�� ȣ��Ǿ���");
	}
	void infor()
	{
		System.out.println(weight + " "+ picture);
	}
}
