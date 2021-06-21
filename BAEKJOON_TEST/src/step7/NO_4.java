package step7;

import java.util.Scanner;

public class NO_4 {

	public static void main(String[] args)  {
		/*2675번 문자열 반복
		 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
		 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
		 *  S에는 QR Code "alphanumeric" 문자만 들어있다.
		 *  QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
		 *입력 예제)
		 *2
		 *3 ABC
		 *5 /HTP
		 *
		 *AAABBBCCC
		 */////HHHHHTTTTTPPPPP		 */
		int n;
		String s;
		Scanner in=new Scanner(System.in);
		
		int data=in.nextInt(); //테스트 케이스 입력
		
		for(int i=0;i<data;i++) {
			n=in.nextInt();
			s=in.next();
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<n;k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
	}

}
