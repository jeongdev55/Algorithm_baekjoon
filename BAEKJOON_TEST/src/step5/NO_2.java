package step5;

import java.io.*;
import java.util.Arrays;


public class NO_2 {

	public static void main(String[] args) throws IOException {
		/*2562번 최대값
		 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		 * 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61이 주어지면, 
		 * 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		int arr[]=new int[9];
		int max=0;  //max값 저장 공간
		int number = 0; //max의 위치를 저장할 공간
		int count=0;
		

		
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		
		for(int x:arr) {
			count++;
			if(x>max) {
				max=x;
				number=count;
			}
		}
		
		br.close();
		System.out.println(max);
		System.out.println(number);

	}

}
