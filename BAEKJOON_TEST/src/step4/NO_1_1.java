package step4;

import java.io.*;
import java.util.StringTokenizer;

public class NO_1_1 {

	public static void main(String[] args) throws IOException {
		/*10952 번 
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 *각 테스트 케이스마다 A+B를 출력한다.
		 */
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =new BufferedWriter (new OutputStreamWriter(System.out));
		int a=1;
		int b;
		
		StringTokenizer st;
		
		while(a !=0) {
			st=new StringTokenizer(br.readLine()," ");
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			if(a !=0 &&a !=0) {
				int c=a+b;
				bw.write(c+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
