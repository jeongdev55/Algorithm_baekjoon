package step5;

import java.util.Scanner;

public class NO_4 {

	public static void main(String[] args) {
		/*1546번 나머지
		 * 입력된 점수중 가장 큰값을 M
		 * M보다 작은점수들은  점수/M*100으로 수정 후 평균 구하기
		 * 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
		 */
		Scanner in = new Scanner(System.in);
		
		int data=in.nextInt();
		double []arr=new double[data];
		
		double max=0;
		double sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextDouble();
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]/max*100;
			sum+=arr[i];
		}
		System.out.println(sum/data);
	}
}


