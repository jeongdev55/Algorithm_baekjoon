package step3;

import java.io.*;

public class NO_10_1 {

	public static void main(String[] args) throws IOException {
		/*2439�� �����
		 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		 * ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
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

