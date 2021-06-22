package step7;

import java.util.Scanner;

public class NO_6 {

	public static void main(String[] args)  {
		/*1152번 단어의 개수
		 * 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
		 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
		 * 첫째 줄에 단어의 개수를 출력한다.
		 */
		Scanner in=new Scanner(System.in);
		String str=in.nextLine().trim();  //앞 뒤 공백제거
		String []s=str.split(" "); //공백으로 나눠서 배열에 저장
		
		if(str.isEmpty())
			System.out.print(0); //만약 단어가 입력되지 않았을 경우 0 출력
		else 
			System.out.println(s.length);
	}

}
