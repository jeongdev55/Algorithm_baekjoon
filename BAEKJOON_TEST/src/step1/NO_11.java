package step1;


import java.util.Scanner;

public class NO_11 {

	public static void main(String[] args) {
		/* 2588번 
		 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
		 * (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		 * 
		 * 		 			4   7   2    			.......(1)
		 * 		  	   	 x 	3   8   5   			.......(2)
		 *  	__________________
		 *  		       2   3   6   0   		.......(3)			// 472*5   >> b를 10으로 나눈 나머지! 
		 *    		  3   7   7   6      		.......(4)			// 472*8   >> b를 100으로 나눈 후 10을 나눈 몫
		 *   	 1   4   1   6 			   		.......(5)			//472*3    >> b를 100으로 나눈 몫
		 *   _____________________
		 *      1	  8   1   7   2   0	   		.......(5)
		 */		
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		
		
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
	}

}
