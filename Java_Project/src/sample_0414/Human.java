package sample_0414;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cl = new Car();
		cl.setMan(4);
		cl.getMan();//get,set�̶�� �����ü�� �������. cccman�� ��� ����
		/*cl.man = 5;
		cl.tire = 3;
		cl.color = "red";*/
		cl.pr();
	
	Car c2 = new Car(3,4,"white");
	c2.pr();
}
	
}
