package step6;


import java.util.Scanner;

public class NO_3 {

	public static void main(String[] args) {

		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();

		
		if(n<100) {
			System.out.println(n);   //100�̸��� ���� �� ��ü�� ���������� �ش�ȴ�. 
		}
		else {
			int result=99;
			for(int i=100;i<=n;i++) {
				result+=d(i);
			}
		System.out.println(result);
		}
}

	private static int d(int n) {
		
		int a=n/100;
		int b=(n%100)/10;
		int c= n%10;
		if(b*2==a+c) {
			return 1;	
		}				
		return 0;		
	}

}