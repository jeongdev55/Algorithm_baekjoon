package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NO_8 {

	public static void main(String[] args) throws IOException {
		/* 11022��
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
		 * Case #1: 1 + 1 = 2
		 */
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));

		
		int data=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=1;i<=data;i++) {
			st=new StringTokenizer(br.readLine()," ");
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));

		}
		br.close();

	}
}






