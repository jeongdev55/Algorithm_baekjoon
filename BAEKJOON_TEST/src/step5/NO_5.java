package step5;

import java.util.Scanner;

public class NO_5 {

	public static void main(String[] args)  {
		/*8958번 ox퀴즈
		 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
		 * 
		 * n길이의 스트링 배열필요
		 * 배열 안에서 char배열이 존재하는
		 */
		Scanner in=new Scanner(System.in);
		
		int data=in.nextInt();
		String arr[] =new String[data];

		
		for(int i=0;i<data;i++) {
			arr[i]=in.next();
			int cnt=0;
			int sum=0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O')
					cnt++;
				else
					cnt=0;
				sum+=cnt;
				
				}
			System.out.println(sum);
			}
		in.close();
	}			
}	




