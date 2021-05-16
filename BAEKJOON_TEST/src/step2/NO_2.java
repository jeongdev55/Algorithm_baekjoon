package step2;

import java.util.Scanner;

public class NO_2 {

	public static void main(String[] args) {
		/* 9498번 
		 *시험 점수를 입력받아 
		 *90 ~ 100점은 A,
		 * 80 ~ 89점은 B, 
		 * 70 ~ 79점은 C,
		 * 60 ~ 69점은 D,
		 *  나머지 점수는 F를 출력하는 프로그램을 작성하시오.
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
