package sample_0414;

public class Television {

	int channel;
	int volume;
	boolean onOff;

	public Television(){//method overloading
	this(10,3123,true);//this로 현재객체
	//this.channel = 103;//미리 값을 준 값을 미리 만들어놓기
	//this.volume =212412;
	//this.onOff = true;
	}
	public Television(int channel, int volume){
	this(channel,volume,true);}//반드시 true라는 가정하에 진행되는 메소드
	
	public Television(int c, int v, boolean o){
	this.channel = c;//this 안써도 됨
	this.volume = v;
	this.onOff = o;
	}
	
	//public television2(int ca, int va, boolean o){
	//클래스랑 이름이 달라서 메소드가 아니다. 따라서 생성자도 아니고}

	//public Television(int a, double b, boolean o) 요렇게 하면 위에 this(10.23,22,true)라는 식으로 하면 이 쪽으로 인식한다(뭘론 위에 double VOL같은걸 만들어야함)
	//{
		//this.channel = a;
		//this.volume = b;
		//this.onOff = o;
		
	//}
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");

	}
	

}
