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
	}*/ //나중에도 쓰기 위해 return 받는 것. 없어도 이거 자체는 작동
	public void pr(){
		System.out.println("man : "+man+" tire : " +tire+" color : "+color );
	}
	

	
		
	
}
