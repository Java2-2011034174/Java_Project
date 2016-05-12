package sample_0512;

public class Lion extends Animal
{
	private int legs;
	
	public Lion() {
		super(100 ,"KING");//이걸 왜 넣을까? 자동으로 되는데 - Animal 에서 생성자가 여러개 있을 때, 특정한 것을 돌릴 수 있게 되었다. 돌려 보면 Aniaml의 밑의 것이 돌아간것을 볼 수 있을 것이다.
		this.legs =4;
	}
	//Source의 generate constructor using filed 사용
	void roar()
	{
		System.out.println("roar()가 호출되었음");
	}
	void infor()
	{
		System.out.println(weight + " "+ picture);
	}
}
