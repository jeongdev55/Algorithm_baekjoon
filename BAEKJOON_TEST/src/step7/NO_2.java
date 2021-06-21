package step7;

import java.util.Scanner;

public class NO_2 {

	public static void main(String[] args) {
		/*11720번 숫자의 합
		 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 */
		Scanner in=new	Scanner(System.in);
		
		//몇개의 숫자를 받을 것인지
		int a=in.nextInt();
		
		//입력되는 모든 숫자를 문자열로 받음
		String s=in.next();
		
		//숫자의 합을 받을 공간
		int sum=0;

		for(int i=0;i<a;i++) {
			sum+=s.charAt(i)-'0';  //반복문을 통해서 문자를 하나씩 받아서 더함
			//문자로 받은 숫자를 아스키코드로 변환하여 -'0'의 값을 해주면 본래의 값으로 돌아옴
		}
		System.out.println(sum);
		
	}

}
