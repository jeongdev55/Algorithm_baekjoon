package step3;

import java.io.*;
import java.util.StringTokenizer;

public class NO_11_1 {

	public static void main(String[] args) throws IOException {
		/*10871번 x보다 작은 수
		 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
		 */
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine()," ");
		int N=Integer.parseInt(st.nextToken());  //몇개를 비교할건지
		int X=Integer.parseInt(st.nextToken());  // x의 기준 수
		

		st=new StringTokenizer(br.readLine()," ");	
		for(int i=0;i<N;i++) {
			int a=Integer.parseInt(st.nextToken());
			if(a<X) {
				bw.write(a+" ");				
			}				
		}

		bw.flush();
}

}

