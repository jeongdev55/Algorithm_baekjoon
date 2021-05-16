package step3;

import java.io.*;

public class NO_9 {

	public static void main(String[] args) throws IOException {
		/*2438번 별찍기
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 */
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<=i;j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}



