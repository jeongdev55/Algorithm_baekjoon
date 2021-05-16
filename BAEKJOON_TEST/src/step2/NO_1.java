package step2;

import java.util.Scanner;

public class NO_1 {

	public static void main(String[] args) {
		/* 1330번 
		 *두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		 */
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		
		
		if(A>B) 
			System.out.println(">");
		
		if(A<B) 
			System.out.println("<");
		
		if(A==B) 
			System.out.println("==");		
	}

}
