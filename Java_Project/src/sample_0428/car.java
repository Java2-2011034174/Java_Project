package sample_0428;

public class car {

	private String model;
	private String color;
	private int speed;
	
	
	private int id;
	static int numbers =0;
	

	
	public car(String m, String c, int s){
		model=m;
		color=c;
		speed =s;
		
		id=++numbers;
	}
		public static int getNumbers(){ return numbers; }

	
}
