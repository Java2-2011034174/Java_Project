package sample_0324;

public class Apt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=9;i>0;i--)
		{
				
			for(int j=1;j<8;j++)
			{
				if(i>5 && j>5) // �̰� ���� �� �߳�. �� �����ϰ� �߾�
				{
					break; 
				}
				System.out.print(i*100 + j + " ");

			}
			
			System.out.println(" ");
				
		}
		
	}

}
