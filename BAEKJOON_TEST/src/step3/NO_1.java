package step3;

import java.util.Scanner;

public class NO_1 {

	public static void main(String[] args) {
		/*2739번 구구단
		 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		 */
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();   //몇단을 출력할 것인지 입력받음
		
		for(int i=1;i<=9;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
		}
	}



