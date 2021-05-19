package step5;

import java.util.Scanner;

public class NO_6 {

	public static void main(String[] args)  {
		/*4344번 평균은 넘겠지
		 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
		 *  이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 *  각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		 */
		Scanner in =new Scanner(System.in);
		int T=in.nextInt();  // 몇개의 케이스를 진행할 것인지
		
		for(int i=0;i<T;i++) {   //입력받은 T만큼 진행

			int num=in.nextInt();
			int arr [] =new int [num];  // 입력받은 수 만큼의 배열 크기 지정
			int sum=0, avg=0,cnt=0;

			for(int j=0;j<num;j++) {
				arr[j]=in.nextInt();
				sum+=arr[j]; 
			}

			avg=sum/num;
			
			for(int q=0;q<num;q++) {
				if(arr[q]>avg) {
					cnt++;
				}
			}
			
			double result =(double) cnt/num*100;  //평균을 넘는 비율을 구하기
			System.out.printf("%.3f", result);
			System.out.println("%");
		}
		in.close();
	}			
}	




