package step3;

import java.io.*;
import java.util.StringTokenizer;

public class NO_7_1 {

	public static void main(String[] args) throws IOException {
		/* 11021��
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		 */
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));

		
		int data=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=1;i<=data;i++) {
			st=new StringTokenizer(br.readLine()," ");
			System.out.println("Case #"+i+": "
			+(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())));
		}
		br.close();

	}
}






