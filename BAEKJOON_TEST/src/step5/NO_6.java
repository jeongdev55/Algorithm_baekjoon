package step5;

import java.util.Scanner;

public class NO_6 {

	public static void main(String[] args)  {
		/*4344�� ����� �Ѱ���
		 * ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����,
		 *  �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		 *  �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
		 */
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();  // ��� ���̽��� ������ ������
		
		for(int i=0;i<T;i++) {   //�Է¹��� T��ŭ ����

			int num=in.nextInt();
			int arr [] =new int [num];  // �Է¹��� �� ��ŭ�� �迭 ũ�� ����
			int sum=0, avg=0,cnt=0;

			for(int j=0;j<num;j++) {
				arr[j]=in.nextInt();
				sum+=arr[j]; 
			}

			avg=sum/num;
			
			for(int q=0;q<num;q++) {
				if(arr[q]>avg) {
					cnt++;
				}
			}
			
			double result =(double) cnt/num*100;  //����� �Ѵ� ������ ���ϱ�
			System.out.printf("%.3f", result);
			System.out.println("%");
		}
		in.close();
	}			
}	




