package step7;

import java.util.Scanner;

public class NO_6 {

	public static void main(String[] args)  {
		/*1152�� �ܾ��� ����
		 * ���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
		 * ù° �ٿ� �ܾ��� ������ ����Ѵ�.
		 */
		Scanner in=new Scanner(System.in);
		String str=in.nextLine().trim();  //�� �� ��������
		String []s=str.split(" "); //�������� ������ �迭�� ����
		
		if(str.isEmpty())
			System.out.print(0); //���� �ܾ �Էµ��� �ʾ��� ��� 0 ���
		else 
			System.out.println(s.length);
	}

}
