package step2;

import java.util.Scanner;

public class NO_5 {

	public static void main(String[] args) {
		/* 2884번 
		 * 45분 일찍 알람 설정하기
		 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
		 * 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다
		 * 입력 시간은 24시간 표현을 사용한다. 
		 * 24시간 표현에서 하루의 시작은 0:0(자정)이고, 
		 * 끝은 23:59(다음날 자정 1분 전)이다. 
		 * 만약 10시 10분으로 알람을 맞추면 9시 25분
		 * -35
		 * 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("시간 분 입력: ");
		int H=in.nextInt();    //H시
		int M=in.nextInt();	//M분

		// 45분 마이너스 실행

		
		//0보다 크거나 
		if(0<=H && H<=23) {
			M=M-45;
			if(0<=M) {
				System.out.println(H +" "+ M);		//뺏을때 분이나 시간이 바뀌지 않으면 그대로 출력
			}else if(0>M) {  //만약 45를 뺸후 분이 마이너스라면
				M=60+M;   //분을 다시 설정
				H=H-1;		//분이 마이너스 일때 시간을 하나 빼줌
				if(H<0) {  // 만약 시간이 0이였다면 시간또한 마이너스
					H=24+H;    //시간 다시 설정
				}
				System.out.println(H +" "+ M);	
			}
		}
		
		
	}
								
}


