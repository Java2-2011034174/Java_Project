package sample_0513;

public class Shapetest {

	public static void main(String[] args)
	{
		//Shape s1 = new Shape();
		Rec r1 = new Rec();
		Cir c1 = new Cir();
	
		//s1.move(99, 99);
		r1.move(157, 157);	
		c1.move(3, 3);
		infor(r1);
		infor(c1);
		
		r1.info();
}
	static void infor(Shape ro)
	{
		ro.info();
		ro.iii();
	} // �̰� ���� �������� Ȱ��ȴ�. �θ� Ŭ������ �̿��� �ڽ� Ŭ������ �� �ȴ�. �� �̰� ������ �޼ҵ� �������̵��� �ʿ��ϴ�.
	/*static void inforrr(Rec r)
	{
		r.info();
	} */ // �ڽ��� 30���� �޼ҵ� 30�� �ʿ��ϰ� ��. �̹������ �ϸ�
	
	/*static void infor(Cir c)
	{
		c.info();
	}*/
	}

	//�������� ���� ���� ! : ��?? ���� ���� ������, ���� �Ը� �ðų� ������ �þ��� ��, �׳� ���� (Rec r - 24��)���� �Ÿ� ���� ����Ǹ� �ϳ��ϳ� ����/�߰��� �ؾ��Ѵ�. �ϳ��� Ŭ���� �̸��� ������ �ؿ� 
//���ӵǴ� �ڽ��� �� �� �� �ִ�

