package step3;

import java.util.Scanner;

public class NO_9_1 {

	public static void main(String[] args) {
		/*2438번 별찍기
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 */
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();   //몇번째 줄까지 별을 찍을 것인지
		
		for(int i=0;i<n;i++) {  //줄에 대한 for
			for(int j=0;j<=i;j++)		//별에 대한 for
				System.out.print("*");  //i줄일때 i개만큼 별을 찍기위함 /j(별)이 i개수 만큼 찍힘
			System.out.println();  //줄이 끝났을때 줄바꿈
		}		
	}
}



