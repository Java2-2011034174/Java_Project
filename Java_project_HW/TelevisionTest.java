package Java_project_HW;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("�ڷ������� ä���� " + tv.channel + "�̰� ������ " + tv.volume + "�Դϴ�.");

		Television mytv = new Television();
		mytv.channel = 7;
		mytv.volume = 10;
		mytv.onOff = true;

		Television yourtv = new Television();

		yourtv.channel = 9;
		yourtv.volume = 12;
		yourtv.onOff = true;
		System.out.println("���� �ڷ������� ä���� " + mytv.channel + "�̰� ������ " + mytv.volume + "�Դϴ�.");

		System.out.println("���� �ڷ������� ä���� " + yourtv.channel + "�̰� ������ " + yourtv.volume + "�Դϴ�.");

	}

}