package Java_project_HW;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "입니다.");

		Television mytv = new Television();
		mytv.channel = 7;
		mytv.volume = 10;
		mytv.onOff = true;

		Television yourtv = new Television();

		yourtv.channel = 9;
		yourtv.volume = 12;
		yourtv.onOff = true;
		System.out.println("나의 텔레비전의 채널은 " + mytv.channel + "이고 볼륨은 " + mytv.volume + "입니다.");

		System.out.println("너의 텔레비전의 채널은 " + yourtv.channel + "이고 볼륨은 " + yourtv.volume + "입니다.");

	}

}