package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NO_4 {

	public static void main(String[] args) throws IOException {
		/*1552��
		 * Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�
		 * ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.
		 * �� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine()); //����� ������ ������ ������ �����͸� �Է¹���
        //�������� �Է¹��� �����͸� int������ n������ ����
		
		StringTokenizer st;  //StringTokenizer ��� ����
		
		for(int i=0;i<N;i++) {     // n=5 / 5�� �ٿ� ���ļ� �����͸� �Է¹���
			st =new StringTokenizer(br.readLine()," ");   
            //�Է¹��� �����͸� StringTokenizer�� ���ؼ� " " (�����̽���)�� �����Ͽ� st�� ����
			bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
            //st�ȿ� ����ִ� �����͸� nextToken()�� ���ؼ� �ϳ��� �����
		}
		br.close();
		bw.flush();
		br.close();

	}
}





