package sample_0407;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String proverb = "A barking dog";
			String s1,s2,s3,s4;
			
			System.out.println("�������� ���� ="+proverb.length());
		
			s1=proverb.concat(" never bites!");
			s2=proverb.replace('b','B');
			s3=proverb.substring(0,5);
			s4=proverb.toUpperCase();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
	}

}
