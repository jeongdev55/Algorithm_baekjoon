package step3;

import java.util.Scanner;

public class NO_5 {

	public static void main(String[] args) {
		/* 2741번 찍기 N
		 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		 */
		Scanner in=new Scanner(System.in);
		int data=in.nextInt();
		
		for(int i=1;i<=data;i++) {
			System.out.println(i);
		}
	}
}






