package step3;

import java.util.Scanner;

public class NO_7 {

	public static void main(String[] args) {
		/* 11021��
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		 */
		Scanner in= new Scanner(System.in);
		
		int data=in.nextInt();
		for(int i=1;i<data+1;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}






