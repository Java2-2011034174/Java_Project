package sample_0324;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[2][4];

		for (int i = 0, k = 1; i < 2; i++) {
			for (int j = 0; j < 4; j++, k++) {
				System.out.print(array[i][j] = k);
			}
			System.out.println(" ");
		}
		int[] array2 = { 1, 3, 5, 10, 6, 7 };
		for (int x : array2) {// for each ����. swift, ���̽� ��� ���� ����ϴ� ����. �ϳ��ϳ�
								// �Ѱ��ش�
			System.out.println("xxxxxx" + x);
		}
	}

}
