package step7;

import java.util.Scanner;

public class NO_4 {

	public static void main(String[] args)  {
		/*2675�� ���ڿ� �ݺ�
		 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
		 *  S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
		 *  QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
		 *�Է� ����)
		 *2
		 *3 ABC
		 *5 /HTP
		 *
		 *AAABBBCCC
		 */////HHHHHTTTTTPPPPP		 */
		int n;
		String s;
		Scanner in=new Scanner(System.in);
		
		int data=in.nextInt(); //�׽�Ʈ ���̽� �Է�
		
		for(int i=0;i<data;i++) {
			n=in.nextInt();
			s=in.next();
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<n;k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
	}

}
