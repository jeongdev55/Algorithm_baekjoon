package step1;


import java.util.Scanner;

public class NO_9 {

	public static void main(String[] args) {
		/* 10869번 
		 * 두 자연수 A와 B가 주어진다. 
		 * 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
		 */
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
	}

}
