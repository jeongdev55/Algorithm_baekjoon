package step3;

import java.util.Scanner;

public class NO_2 {

	public static void main(String[] args) {
		/*10950�� 
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 */
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();   //��� ���Ұ����� 
		
		for(int i=1;i<=T;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a+b);
		}
	}
}




