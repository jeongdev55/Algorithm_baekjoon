package step3;

import java.util.Scanner;

public class NO_9_1 {

	public static void main(String[] args) {
		/*2438�� �����
		 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		 */
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();   //���° �ٱ��� ���� ���� ������
		
		for(int i=0;i<n;i++) {  //�ٿ� ���� for
			for(int j=0;j<=i;j++)		//���� ���� for
				System.out.print("*");  //i���϶� i����ŭ ���� ������� /j(��)�� i���� ��ŭ ����
			System.out.println();  //���� �������� �ٹٲ�
		}		
	}
}



