package step3;

import java.io.*;
import java.util.StringTokenizer;

public class NO_11_1 {

	public static void main(String[] args) throws IOException {
		/*10871�� x���� ���� ��
		 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
		 */
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine()," ");
		int N=Integer.parseInt(st.nextToken());  //��� ���Ұ���
		int X=Integer.parseInt(st.nextToken());  // x�� ���� ��
		

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

