package step2;

import java.util.Scanner;

public class NO_3 {

	public static void main(String[] args) {
		/* 2753�� 
		 *������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		 *���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
		 *1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
		 *������, 2000���� 400�� ����̱� ������ �����̴�.
		 */
		Scanner in=new Scanner(System.in);
		int data=in.nextInt();
		
		if(data%4==0 && data%100 !=0 || data%400==0)
			System.out.println("1");
		else
			System.out.println("0");
		
	}

}
