package sample_0414;

public class Television {

	int channel;
	int volume;
	boolean onOff;

	public Television(){//method overloading
	this(10,3123,true);//this�� ���簴ü
	//this.channel = 103;//�̸� ���� �� ���� �̸� ��������
	//this.volume =212412;
	//this.onOff = true;
	}
	public Television(int channel, int volume){
	this(channel,volume,true);}//�ݵ�� true��� �����Ͽ� ����Ǵ� �޼ҵ�
	
	public Television(int c, int v, boolean o){
	this.channel = c;//this �Ƚᵵ ��
	this.volume = v;
	this.onOff = o;
	}
	
	//public television2(int ca, int va, boolean o){
	//Ŭ������ �̸��� �޶� �޼ҵ尡 �ƴϴ�. ���� �����ڵ� �ƴϰ�}

	//public Television(int a, double b, boolean o) �䷸�� �ϸ� ���� this(10.23,22,true)��� ������ �ϸ� �� ������ �ν��Ѵ�(���� ���� double VOL������ ��������)
	//{
		//this.channel = a;
		//this.volume = b;
		//this.onOff = o;
		
	//}
	void print() {
		System.out.println("ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�.");

	}
	

}
