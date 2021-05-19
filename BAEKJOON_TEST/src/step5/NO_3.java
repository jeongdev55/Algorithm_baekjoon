package step5;

import java.io.*;
import java.util.Arrays;


public class NO_3 {

	public static void main(String[] args) throws IOException {
		/*V번 숫자의 개수
		 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 
		 * 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		 * 예를 들어 A = 150, B = 266, C = 427 이라면 
		 * A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
		 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int A=Integer.parseInt(br.readLine());
		int B=Integer.parseInt(br.readLine());
		int C=Integer.parseInt(br.readLine());
		int num=A*B*C;  //입력받은 3개의 수의 합을 num에 넣음
		
		String str=Integer.toString(num);  //int형 num의 값을 string으로 캐스팅해줌
		
		char[] arr=str.toCharArray(); //문자열 str을 char배열에 넣음
		
		int []number=new int[10]; 	// 0~9까지 몇번이 나왔는지에 대한 값을 담을 배열 선언
		
		// arr배열에 num 값 17037300 의 수가 담겼다고 가정
		// 각 자리수를 구하기 위해서는 나머지(%10)을 통해서 1의 자리씩 가져와야함
		// number 배열의 index를 통해서 값을 넣을 것. 
		// 첫번째 num%10을 통해 0이 나옴 = number[num%10] 인덱스를 의미.
		// 이때 number[0] 번의 값을 ++증가 시키면 배열 0번째 즉, 0의 값이 1임을 넣게되는 것 
		// 증가시킨 후에는 다음 숫자를 찾기 위해 이미 추가한 첫번째 자리수를 지워야함
		// 그렇기에 num의 값을 10으로 계속 나눠줘야함
		
		for(int i=0;i<arr.length;i++) {
			number[num%10]++;    	//나눈 값 즉, 1의 자리를 비교함 0~9중에 있는 값에 증가함
			num/=10;   				  	//나머지를 뺀 다음 10으로 다시 나눔
		}
		
		for(int x:number)  //배열의 값을 꺼내기 위한 반복문
			System.out.println(x);
	}

}
