package step6;

import java.util.Scanner;

public class NO_3 {

	public static void main(String[] args) {
		/* 1065�� �Ѽ�
		 * � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
		 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
		 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
		 * 
		 * ���� 147���� 1�� 4�� 3����/ 4�� 7�� 3���̷� ���������� ��Ÿ���ϴ�. 
		 * ��,  ��� ���� ������ ���� ���Ѱ��� 2�谡 �ȴٸ� �� ���� �Ѽ��� �˴ϴ�.
		 */
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();

		
		if(n<100) {
			System.out.println(n);   //100�̸��� ���� �� ��ü�� ���������� �ش�ȴ�. 
		}
		else {
			int result=99;
			for(int i=100;i<=n;i++) {
				result+=d(i);
			}
		System.out.println(result);
		}
}

	private static int d(int n) {
		
		int a=n/100;
		int b=(n%100)/10;
		int c= n%10;
		if(b*2==a+c) {
			return 1;	
		}				
		return 0;		
	}

}
