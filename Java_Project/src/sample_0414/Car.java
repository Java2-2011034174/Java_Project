package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;
	
	
	public Car(){
		this(4,3,"red");
	}
	
	public Car(int man, int tire, String color)
	{
		this.man = man;this.tire = tire;this.color=color;
	}
	
	
	public void setMan(int man){
		this.man = man;
	}

	
	public int getMan(){
		System.out.println(man);
		return man;
	}
	/*public void all_set(int tire, String color){
		this.tire=tire;
		this.color=color;
	}*/
	/*public void getMan(){
		System.out.println(man);
	}*/ //���߿��� ���� ���� return �޴� ��. ��� �̰� ��ü�� �۵�
	public void pr(){
		System.out.println("man : "+man+" tire : " +tire+" color : "+color );
	}
	

	
		
	
}
