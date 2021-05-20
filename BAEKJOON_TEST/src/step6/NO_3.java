package step6;

import java.util.Scanner;

public class NO_3 {

	public static void main(String[] args) {
		/* 1065번 한수
		 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
		 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		 * 
		 * 만일 147에서 1과 4는 3차이/ 4와 7도 3차이로 등차수열을 나타냅니다. 
		 * 즉,  가운데 수가 양쪽의 수를 더한거의 2배가 된다면 그 수는 한수가 됩니다.
		 */
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();

		
		if(n<100) {
			System.out.println(n);   //100미만의 값은 그 자체로 등차수열에 해당된다. 
		}
		else {
			int result=99;
			for(int i=100;i<=n;i++) {
				result+=d(i);
			}
		System.out.println(result);
		}
}

	private static int d(int n) {
		
		int a=n/100;
		int b=(n%100)/10;
		int c= n%10;
		if(b*2==a+c) {
			return 1;	
		}				
		return 0;		
	}

}
