package step2;

import java.util.Scanner;

public class NO_2 {

	public static void main(String[] args) {
		/* 9498�� 
		 *���� ������ �Է¹޾� 
		 *90 ~ 100���� A,
		 * 80 ~ 89���� B, 
		 * 70 ~ 79���� C,
		 * 60 ~ 69���� D,
		 *  ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner in=new Scanner(System.in);
		int data=in.nextInt();
		
		if(90<=data && data<=100)
			System.out.println("A");
		else if(80<=data && data<=89)
			System.out.println("B");
		else if(70<=data && data<=79)
			System.out.println("C");
		else if(60<=data && data<=69)
			System.out.println("D");
		else 
			System.out.println("F");
		
	}

}
