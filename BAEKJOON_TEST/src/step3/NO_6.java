package step3;

import java.util.Scanner;

public class NO_6 {

	public static void main(String[] args) {
		/* 2742번 기찍 N
		 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오
		 */
		Scanner in=new Scanner(System.in);
		int data=in.nextInt();
		
		for(int i=data;i>0;i--) {
			System.out.println(i);
		}
	}
}






