package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NO_8 {

	public static void main(String[] args) throws IOException {
		/* 11022번
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		 * Case #1: 1 + 1 = 2
		 */
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));

		
		int data=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=1;i<=data;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));

		}
		br.close();

	}
}






