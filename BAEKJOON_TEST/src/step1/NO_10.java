package step1;


import java.util.Scanner;

public class NO_10 {

	public static void main(String[] args) {
		/* 10430번 
		 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		 */
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		
		//입력될 값 5,8,4
		System.out.println((A+B)%C); 		 				 //5+8= 13, 13%4 =1
		System.out.println(((A%C) + (B%C))%C); 		 //5%4  + 8%4 = 1 , 1%4=1
		System.out.println((A*B)%C);   					 //5*8 = 40 , 40%4=0
		System.out.println(((A%C) * (B%C))%C);      //5%4  * 8%4 = 1*0 =0   , 0%4=0
	}

}
