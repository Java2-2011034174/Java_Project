package sample_0414;

import sample_0414.Television;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television mytv = new Television(10,32,true);
		mytv.print();

		Television yourtv = new Television(11,220,true);
		yourtv.print();

		Television myatv = new Television();
		myatv.channel = 132;
		myatv.volume = 22;
		myatv.onOff = true;
		myatv.print();
		

	}

}
