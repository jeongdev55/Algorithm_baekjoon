package step3;

import java.util.Scanner;

public class NO_11 {

	public static void main(String[] args) {
		/*10871�� x���� ���� ��
		 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
		 */

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		
		String str=in.nextLine();
		String []st=str.split(" ");
				
		
		for(int i=0;i<n;i++) {
			if(Integer.parseInt(st[i])<x) {
				System.out.print(st[i]);
			}
				
		}
	 
}

}

