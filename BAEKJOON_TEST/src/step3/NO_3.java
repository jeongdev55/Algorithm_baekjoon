package step3;

import java.util.Scanner;

public class NO_3 {

	public static void main(String[] args) {
		/*8393��
		 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
		 */
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();   //1���� ����� ���Ҳ���
		int sum=0;

		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}





