package sample_0407;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television();
		mytv.channel = 17;
		mytv.volume = 22;
		mytv.onOff = true;
		mytv.print();

		Television testtv = new Television();
		testtv = mytv;
		testtv.channel = 2327;

		mytv.print();

		Television yourtv = new Television();
		yourtv.channel = 18;
		yourtv.volume = 2131;
		yourtv.onOff = true;
		System.out.println("Current Channel :" + yourtv.changeChannel(24));

		yourtv.print();

	}

}
