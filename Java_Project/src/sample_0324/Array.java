package sample_0324;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];//앞이 1번 //{10, 20, 30} 2번  방식;
		int[] array2 = {11,3,4,123,3,61};
		//System.out.println(array[1]);
		for(int i=0;i<10;i++)
		{
			array[i] = (i+1)*10;
			System.out.println("array["+i+"]" + " " + array[i]);
		}
		array2[0] = array2[3] + array2[5];
	}

}
