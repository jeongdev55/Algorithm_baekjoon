package step4;

import java.util.Scanner;


public class NO_2 {
	/*
	 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	 * 테스트 케이스가 주어지지 않음
	 * 입력이 없을때는 실행되지 않는 것으로 hasNextInt()로 돌림
	 */

	public static void main(String[] args)  {

	        Scanner in = new Scanner(System.in);
	        while(in.hasNextInt())
	            System.out.println(in.nextInt() + in.nextInt());
	    


	    }
	}

