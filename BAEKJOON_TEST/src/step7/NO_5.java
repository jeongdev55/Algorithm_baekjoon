package step7;

import java.util.Scanner;

public class NO_5 {

	public static void main(String[] args)  {
		/*1157번 단어공부
		 * 알파벳 대소문자로 된 단어가 주어지면, 
		 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
		 *  단, 대문자와 소문자를 구분하지 않는다.
		 */
		Scanner in=new Scanner(System.in);
		String str=in.next(); //입력 받을 시  대문자로 저장
		
		int []arr=new int [26]; //영문자의 개수는 26
		
		for(int i=0;i<str.length();i++) {
			if(65<=str.charAt(i) && str.charAt(i)<=90) {
				arr[str.charAt(i)-65]++;
			}
			else{
				arr[str.charAt(i)-97]++;
			}
			
		}
		
		int max=-1;
		char ch='?';
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch=(char)(i+65);  //대문자 출력을 위한 +65
				
			}else if(arr[i]==max) {
				ch='?';  //max랑 같은 값을 가진게 존재할 경우 ?를 출력
			}
		}
		
		System.out.println(ch);
		

	}

}
