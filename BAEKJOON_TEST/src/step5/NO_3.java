package step5;

import java.io.*;
import java.util.Arrays;


public class NO_3 {

	public static void main(String[] args) throws IOException {
		/*V�� ������ ����
		 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� 
		 * ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ���� ��� A = 150, B = 266, C = 427 �̶�� 
		 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
		 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		 */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int A=Integer.parseInt(br.readLine());
		int B=Integer.parseInt(br.readLine());
		int C=Integer.parseInt(br.readLine());
		int num=A*B*C;  //�Է¹��� 3���� ���� ���� num�� ����
		
		String str=Integer.toString(num);  //int�� num�� ���� string���� ĳ��������
		
		char[] arr=str.toCharArray(); //���ڿ� str�� char�迭�� ����
		
		int []number=new int[10]; 	// 0~9���� ����� ���Դ����� ���� ���� ���� �迭 ����
		
		// arr�迭�� num �� 17037300 �� ���� ���ٰ� ����
		// �� �ڸ����� ���ϱ� ���ؼ��� ������(%10)�� ���ؼ� 1�� �ڸ��� �����;���
		// number �迭�� index�� ���ؼ� ���� ���� ��. 
		// ù��° num%10�� ���� 0�� ���� = number[num%10] �ε����� �ǹ�.
		// �̶� number[0] ���� ���� ++���� ��Ű�� �迭 0��° ��, 0�� ���� 1���� �ְԵǴ� �� 
		// ������Ų �Ŀ��� ���� ���ڸ� ã�� ���� �̹� �߰��� ù��° �ڸ����� ��������
		// �׷��⿡ num�� ���� 10���� ��� ���������
		
		for(int i=0;i<arr.length;i++) {
			number[num%10]++;    	//���� �� ��, 1�� �ڸ��� ���� 0~9�߿� �ִ� ���� ������
			num/=10;   				  	//�������� �� ���� 10���� �ٽ� ����
		}
		
		for(int x:number)  //�迭�� ���� ������ ���� �ݺ���
			System.out.println(x);
	}

}
