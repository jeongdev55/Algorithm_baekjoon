package step2;

import java.util.Scanner;

public class NO_1 {

	public static void main(String[] args) {
		/* 1330�� 
		 *�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
