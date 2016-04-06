package Java_project_HW;

public class TelevisionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television2 mytv = new Television2();
		mytv.channel = 7;
		mytv.volume = 9;
		mytv.onOff = true;
		mytv.print();
		Television2 yourtv = new Television2();

		yourtv.channel = 9;
		yourtv.volume = 12;
		yourtv.onOff = true;
		yourtv.print();
	}

}

