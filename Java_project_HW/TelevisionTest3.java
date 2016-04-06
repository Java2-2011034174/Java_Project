package Java_project_HW;

public class TelevisionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television3 mytv = new Television3();
		mytv.channel = 7;
		mytv.volume = 9;
		mytv.onOff = true;
		int ch = mytv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다.");

	}
}