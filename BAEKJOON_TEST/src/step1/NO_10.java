package step1;


import java.util.Scanner;

public class NO_10 {

	public static void main(String[] args) {
		/* 10430�� 
		 * (A+B)%C�� ((A%C) + (B%C))%C �� ������?
		 * (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
		 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner in=new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		
		//�Էµ� �� 5,8,4
		System.out.println((A+B)%C); 		 				 //5+8= 13, 13%4 =1
		System.out.println(((A%C) + (B%C))%C); 		 //5%4  + 8%4 = 1 , 1%4=1
		System.out.println((A*B)%C);   					 //5*8 = 40 , 40%4=0
		System.out.println(((A%C) * (B%C))%C);      //5%4  * 8%4 = 1*0 =0   , 0%4=0
	}

}
