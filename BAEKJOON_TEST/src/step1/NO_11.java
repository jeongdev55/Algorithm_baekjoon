package step1;


import java.util.Scanner;

public class NO_11 {

	public static void main(String[] args) {
		/* 2588�� 
		 * (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
		 * (1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
		 * (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * 		 			4   7   2    			.......(1)
		 * 		  	   	 x 	3   8   5   			.......(2)
		 *  	__________________
		 *  		       2   3   6   0   		.......(3)			// 472*5   >> b�� 10���� ���� ������! 
		 *    		  3   7   7   6      		.......(4)			// 472*8   >> b�� 100���� ���� �� 10�� ���� ��
		 *   	 1   4   1   6 			   		.......(5)			//472*3    >> b�� 100���� ���� ��
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
