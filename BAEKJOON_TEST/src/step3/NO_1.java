package step3;

import java.util.Scanner;

public class NO_1 {

	public static void main(String[] args) {
		/*2739�� ������
		 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
		 * ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
		 */
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();   //����� ����� ������ �Է¹���
		
		for(int i=1;i<=9;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		}
	}



