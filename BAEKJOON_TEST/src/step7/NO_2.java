package step7;

import java.util.Scanner;

public class NO_2 {

	public static void main(String[] args) {
		/*11720�� ������ ��
		 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
		 */
		Scanner in=new	Scanner(System.in);
		
		//��� ���ڸ� ���� ������
		int a=in.nextInt();
		
		//�ԷµǴ� ��� ���ڸ� ���ڿ��� ����
		String s=in.next();
		
		//������ ���� ���� ����
		int sum=0;

		for(int i=0;i<a;i++) {
			sum+=s.charAt(i)-'0';  //�ݺ����� ���ؼ� ���ڸ� �ϳ��� �޾Ƽ� ����
			//���ڷ� ���� ���ڸ� �ƽ�Ű�ڵ�� ��ȯ�Ͽ� -'0'�� ���� ���ָ� ������ ������ ���ƿ�
		}
		System.out.println(sum);
		
	}

}
