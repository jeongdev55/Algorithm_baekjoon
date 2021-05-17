package step4;

import java.util.Scanner;

public class NO_1 {

	public static void main(String[] args) {
		/*10952 번 
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 *각 테스트 케이스마다 A+B를 출력한다.
		 */
		Scanner in=new Scanner(System.in);
		int data=1;
		
		while(data !=0) {
			data=in.nextInt();
			int data2=in.nextInt();
			
			if(data !=0 &&data2 !=0) {
				System.out.println(data+data2);
			}
		}

	}

}
