package step7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NO_3 {

	public static void main(String[] args) {
		/*11720�� ������ ��
		 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
		 * �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
		 * ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner in=new	Scanner(System.in);
		// ���� a~z������ �ƽ�Ű�ڵ尪��
		// �빮�� 65~90
		// �ҹ��� 97~122
		
		//���ڿ� �Է�
		String s=in.nextLine();
		
		int arr []=new int[26]; //a-z������ ���ڸ� ���� �迭 ����

		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;  //�ʱⰪ���� -1����
		}
		
		//str�� ���� char��
		for(int i=0;i<s.length();i++) {
			int index=(int)s.charAt(i)-97;
			if(arr[index]==-1) {
				arr[index]=i;
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}