package step7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NO_3 {

	public static void main(String[] args) {
		/*11720번 숫자의 합
		 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
		 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 */
		Scanner in=new	Scanner(System.in);
		// 영문 a~z까지의 아스키코드값은
		// 대문자 65~90
		// 소문자 97~122
		
		//문자열 입력
		String s=in.nextLine();
		
		int arr []=new int[26]; //a-z까지의 숫자를 담을 배열 선언

		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;  //초기값으로 -1적용
		}
		
		//str의 값을 char로
		for(int i=0;i<s.length();i++) {
			int index=(int)s.charAt(i)-97;
			if(arr[index]==-1) {
				arr[index]=i;
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}