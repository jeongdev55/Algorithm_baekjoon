package step3;

import java.io.*;

public class NO_10_1 {

	public static void main(String[] args) throws IOException {
		/*2439번 별찍기
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		 */
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1; i <= N; i++) { 
			for(int j = 1; j <= N - i; j++) {
				bw.write(" ");
			}
			for(int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();	 
}

}

