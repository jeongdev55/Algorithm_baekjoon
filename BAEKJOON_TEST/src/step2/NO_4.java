package step2;

import java.util.Scanner;

public class NO_4 {

	public static void main(String[] args) {
		/* 14681번 
		 *흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
		 *예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
		 *점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
		 *첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
		 *							
		 *							y
		 *							|
		 *		Quadrant2		|		Quadrant1
		 *		  (-12,5)		|			(12,5)		
		 *		______________________		x
		 *							|
		 *		Quadrant3		|		Quadrant4	
		 *	  	(-12,-5)			|			(12,-5)		
		 *
		 */
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		
		if (x>0) {		//x가 0보다 클 경우   1, 4 분면에 해당
			if(y>0) {	//x가 0보다 크고, y 가 0 보다 클 경우  1분면에 해당
				System.out.print("1");
			}else {    //x가 0보다는 크고, y 가 0 보다는 작을 경우 4분면에 해당
				System.out.print("4");
			}
		}else {   //x가 0보다 작을 경우 2, 3 분면에 해당
			if(y>0) {  //x가 0보다 작으며, y가 0보다 클경우 2분면에 해당
				System.out.print("2");
			}else {  //x가 0보다 작으며, y도 0보다 작을 경우 3분면에 해당
				System.out.print("3"); //
			}
		}						
	}

}
