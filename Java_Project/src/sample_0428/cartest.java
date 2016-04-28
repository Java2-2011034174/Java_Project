package sample_0428;

public class cartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car("S600","white",80);
		car c2 = new car("E500","blue",20);
		int n = car.getNumbers();
		System.out.println("지금까지 생성된 자동차 수 = " +n);
	}

}
